package websocket

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.annotation.Keyword
import groovy.transform.CompileStatic
import java.net.URI
import java.util.concurrent.TimeUnit
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest
import org.eclipse.jetty.websocket.client.WebSocketClient
import com.velocitylight.jetty.client.ToUpperClientSocket

@CompileStatic
class WSConnect {
	@CompileStatic
	@Keyword
	static void sendMessage(String uri, String msg) {
		String dest = uri;
		String message = msg;
		WebSocketClient client = new WebSocketClient();
		try {

			ToUpperClientSocket socket = new ToUpperClientSocket();
			client.start();
			URI echoUri = new URI(dest);
			ClientUpgradeRequest request = new ClientUpgradeRequest();
			client.connect(socket, echoUri, request);
			socket.getLatch().await();
			socket.sendMessage(message);
			Thread.sleep(10000l);
			GlobalVariable.WS_Reply = socket.getReply()
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			try {
				client.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}