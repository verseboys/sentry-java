package net.kencochrane.raven.connection.marshaller;

import net.kencochrane.raven.event.interfaces.SentryInterface;
import org.json.simple.JSONObject;

public interface SimpleJsonInterfaceMarshaller {
    JSONObject serialiseInterface(SentryInterface sentryInterface);
}
