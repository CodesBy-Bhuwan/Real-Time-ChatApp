package com.webchat.chat.chat;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public") // this topic comes from config

//    Here 2 methods one is to send message and another is to receive
    public ChatMessage sendMessage(
            @Payload ChatMessage chatMessage
    ){

    }
}
