package com.doupi.gegeda.manager;


import com.doupi.gegeda.config.AiConfig;
import com.zhipu.oapi.service.v4.model.ChatMessage;
import com.zhipu.oapi.service.v4.model.ChatMessageRole;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;

@Component
public class ZhipuAiManager {

    @Resource
    private AiConfig aiConfig;

    public String doSyncRequest(String systemMessage, String userMessage, Float temperature){
        return doRequest(systemMessage, userMessage, Boolean.FALSE, temperature);
    }

    public String doRequest(String systemMessage, String userMessage,Boolean stream, Float temperature ){
        ArrayList<Object> messages = new ArrayList<>();
        ChatMessage systemChatMessage = new ChatMessage(ChatMessageRole.SYSTEM.value(), systemMessage);
        ChatMessage userChatMessage = new ChatMessage(ChatMessageRole.USER.value(), userMessage);
        messages.add(systemChatMessage);
        messages.add(userChatMessage);
        return doRequest(messages, stream, temperature);

    }


}
