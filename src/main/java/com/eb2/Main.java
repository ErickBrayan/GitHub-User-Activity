package com.eb2;

import com.eb2.model.Event;
import com.eb2.service.Api;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            String response = Api.getData(args[0]);

            List<Event> resp = mapper.readValue(response, mapper.getTypeFactory().constructCollectionType(List.class, Event.class));

            Map<String, List<Event>> collect = resp.stream()
                    .collect(Collectors.groupingBy(Event::getType));

            for (String s : collect.keySet()) {

                List<Event> responses = collect.get(s);
                Optional<Event> optionalAction = responses.stream()
                        .filter(r -> r.getPayload().getAction() != null)
                        .findFirst();

                Optional<Event> optionalRepo = responses.stream()
                        .filter(r -> r.getRepo().getName() != null)
                        .findFirst();

                String event = s.replace("Event","");
                String action = optionalAction.map(re -> re.getPayload().getAction()).orElse(null);
                String repo = optionalRepo.isPresent() ? optionalRepo.get().getRepo().getName() : "";
                int count = collect.get(s).size() ;

                if (event.equals("Push")) System.out.println("Pushed " + count + " commits to " + repo);
                if (event.equals("Create")) System.out.println("Do " + count + " " + event + " in " + repo);
                if(action != null) System.out.println(action + " " + count + " " + event + " in " + repo);

            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}