package com.designpattern.abstractfactory.gcp;

import com.designpattern.abstractfactory.Instance;
import com.designpattern.abstractfactory.Instance.Capacity;
import com.designpattern.abstractfactory.ResourceFactory;
import com.designpattern.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
