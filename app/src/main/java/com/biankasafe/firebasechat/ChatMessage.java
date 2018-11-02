package com.biankasafe.firebasechat;

public class ChatMessage {
    private String id;
    private String text;
    private String name;
    private String photoUrl;
    private String imageUrl;

    public ChatMessage() {
    }

    public ChatMessage(String text, String name, String photoUrl, String imageUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
