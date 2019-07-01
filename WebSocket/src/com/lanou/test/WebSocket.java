package com.lanou.test;

import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/webSocket")
public class WebSocket {
	private static CopyOnWriteArraySet<WebSocket> webSocket=
			new CopyOnWriteArraySet<WebSocket>();
	private Session session;
	public void onOpen(Session session){
		this.session = session;
		webSocket.add(this);
	}
	@OnMessage
	public void onMessage(String message,Session session){
		System.out.println("来自客户端的信息:"+message);
		for (WebSocket e : webSocket) {
			e.session.get
		}
	}
}
