package websocket

import com.kms.katalon.core.annotation.Keyword
import groovy.transform.CompileStatic
import java.net.URI
import java.util.concurrent.TimeUnit
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest
import org.eclipse.jetty.websocket.client.WebSocketClient
import examples.SimpleEchoSocket

@CompileStatic
//
//  ========================================================================
//  Copyright (c) 1995-2019 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

/**
 * Example of a simple Echo Client.
 */
class WebSocket {
	@CompileStatic
	@Keyword
	static void main(String uri)
	{
		String destUri = uri;

		WebSocketClient client = new WebSocketClient();
		SimpleEchoSocket socket = new SimpleEchoSocket();
		try
		{
			client.start();

			URI echoUri = new URI(destUri);
			ClientUpgradeRequest request = new ClientUpgradeRequest();
			client.connect(socket, echoUri, request);
			
			// wait for closed socket connection.
			socket.awaitClose(5, TimeUnit.SECONDS);
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
		finally
		{
			try
			{
				client.stop();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}