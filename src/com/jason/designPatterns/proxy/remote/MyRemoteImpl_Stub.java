package com.jason.designPatterns.proxy.remote;

import java.lang.reflect.Method;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import java.rmi.server.RemoteRef;
import java.rmi.server.RemoteStub;

public final class MyRemoteImpl_Stub extends RemoteStub implements MyRemote,
		Remote {
	private static final long serialVersionUID = 2L;
	private static Method $method_sayHello_0;

	static {
		try {
			$method_sayHello_0 = MyRemoteImpl_Stub.class.getMethod("sayHello",
					new Class[0]);
		} catch (NoSuchMethodException localNoSuchMethodException) {
			throw new NoSuchMethodError("stub class initialization failed");
		}
	}

	public MyRemoteImpl_Stub(RemoteRef paramRemoteRef) {
		super(paramRemoteRef);
	}

	public String sayHello() throws RemoteException {
		try {
			Object localObject = this.ref.invoke(this, $method_sayHello_0,
					null, 6043973830760146143L);
			return (String) localObject;
		} catch (RuntimeException localRuntimeException) {
			throw localRuntimeException;
		} catch (RemoteException localRemoteException) {
			throw localRemoteException;
		} catch (Exception localException) {
			throw new UnexpectedException("undeclared checked exception",
					localException);
		}

	}
}