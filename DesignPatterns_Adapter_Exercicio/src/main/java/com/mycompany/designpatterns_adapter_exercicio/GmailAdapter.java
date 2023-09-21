package com.mycompany.designpatterns_adapter_exercicio;

import com.mycompany.designpatterns_adapter_exercicio.gmailClient.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient;

    public GmailAdapter() {
        this.gmailClient = new GmailClient();
    }

    @Override
    public void connect() {
        gmailClient.login();
    }

    @Override
    public void fetchEmails() {
        gmailClient.getEmails();
    }
}