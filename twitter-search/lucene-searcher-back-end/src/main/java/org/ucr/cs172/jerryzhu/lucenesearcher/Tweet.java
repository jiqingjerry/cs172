package org.ucr.cs172.jerryzhu.lucenesearcher;

public class Tweet {

    public String username;
    public String user;
    public String text;
    public String hashtag;
    public String title;
    public String date;

    public Tweet(){}

    public Tweet(String username, String user, String text, String hashtag, String title, String date) {
        this.username = username;
        this.user = user;
        this.text = text;
        this.hashtag = hashtag;
        this.title = title;
        this.date = date;
    }

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getUser() {return user;}
    public void setUser(String user) {this.user = user;}
    public String getText() {return text;}
    public void setText(String text) {this.text = text;}
    public String getHashtag() {return hashtag;}
    public void setHashtag(String hashtag) {this.hashtag = hashtag;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    @Override
    public String toString() {
        return String.format("Tweet[username=%s, user=%s, text=%s, hashtag=%s]", username, user, text, hashtag);
    }
}
