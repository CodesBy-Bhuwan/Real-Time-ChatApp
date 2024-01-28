package com.webchat.chat.config;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketeventListener {

    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event){
//        Here it is to notify if any user leaves the chatbox

    }
}
