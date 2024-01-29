package com.webchat.chat.chat;


//import lombok.*;

import lombok.*;

import java.net.Proxy;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {


    private String content;
    private String sender;
    private MessageType type;

//    public static Proxy builder() {
//        return null;
//    }
}
