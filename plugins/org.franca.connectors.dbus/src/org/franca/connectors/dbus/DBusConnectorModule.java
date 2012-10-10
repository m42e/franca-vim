package org.franca.connectors.dbus;

import org.franca.core.framework.TransformationLogger;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class DBusConnectorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(TransformationLogger.class).in(Singleton.class);
	}
}
