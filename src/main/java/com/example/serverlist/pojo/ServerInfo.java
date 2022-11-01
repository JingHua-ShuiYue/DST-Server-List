package com.example.serverlist.pojo;

public class ServerInfo {
    private String server_name;
    private String server_uri;

    @Override
    public String toString() {
        return "ServerInfo{" +
                "server_name='" + server_name + '\'' +
                ", server_uri='" + server_uri + '\'' +
                '}';
    }

    public String getServer_name() {
        return server_name;
    }

    public void setServer_name(String server_name) {
        this.server_name = server_name;
    }

    public String getServer_uri() {
        return server_uri;
    }

    public void setServer_uri(String server_uri) {
        this.server_uri = server_uri;
    }
}
