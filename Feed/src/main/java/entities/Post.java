/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author davi nicollas
 */
public class Post {
    private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer Link;
    private List <Comments> comments = new ArrayList<>();
    
    
    public Post(){
    }

    public Post(Date moment, String title, String content, Integer Link) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.Link = Link;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLink() {
        return Link;
    }

    public void setLink(Integer Link) {
        this.Link = Link;
    }

    public List<Comments> getComments() {
        return comments;
    }
    public void addComment(Comments comment){
        comments.add(comment);
    }
     public void removeComment(Comments comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(Link );
        sb.append("Likes - ");
        sb.append(sdf.format(moment)+ "\n");
        sb.append(content + "\n");
        sb.append("Comments: " + "\n");
        for(Comments c :comments){
            sb.append(c.getComents()+"\n");
        }
        return sb.toString();
    }
     
    
}
