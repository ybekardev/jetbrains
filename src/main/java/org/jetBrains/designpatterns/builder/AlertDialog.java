package org.jetBrains.designpatterns.builder;

public class AlertDialog {

    private String title;
    private String text;
    private String applyButton;
    private String cancelButton;
    private String footer;
    private String picture;

    AlertDialog(String title, String text, String applyButton, String cancelButton, String footer, String picture){
        this.title = title;
        this.text = text;
        this.applyButton = applyButton;
        this.cancelButton = cancelButton;
        this.footer = footer;
        this.picture = picture;
    }

    @Override
    public String toString(){
        String str = "";
        if(title != null){
            str += "The title is: \"" + title + "\"\n";
        }if(text != null){
            str += "The text is: \"" + text + "\"\n";
        }if(applyButton != null){
            str += "The applyButton is: \"" + applyButton + "\"\n";
        }if(cancelButton != null){
            str += "The cancelButton is: \"" + cancelButton + "\"\n";
        }if(footer != null){
            str += "The footer is: \"" + footer + "\"\n";
        }if(picture != null){
            str += "The picture is: \"" + picture + "\"\n";
        }
        return str;
    }

   static class Builder {
       private String title;
       private String text;
       private String applyButton;
       private String cancelButton;
       private String footer;
       private String picture;

       Builder() {
       }
       Builder setTitle(String title) {
           this.title = title;
           return this;
       }
       Builder setText(String text) {
           this.text = text;
           return this;
       }
       Builder setApplyButton(String applyButton) {
           this.applyButton = applyButton;
           return this;
       }
       Builder setCancelButton(String cancelButton) {
           this.cancelButton = cancelButton;
           return this;
       }
       Builder setFooter(String footer) {
           this.footer = footer;
           return this;
       }
       Builder setPicture(String picture) {
           this.picture = picture;
           return this;
       }

       AlertDialog build() {
           return new AlertDialog(title, text, applyButton, cancelButton, footer, picture);
       }

   }
}
