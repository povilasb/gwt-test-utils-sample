package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.net.URLClassLoader;
import java.net.MalformedURLException;
import java.net.URL;

import com.googlecode.gwt.test.GwtRunner;


public class MyGwtRunner extends GwtRunner {

	static {
		URLClassLoader classLoader = (URLClassLoader) MyGwtRunner.class.getClassLoader();
		try {
			URL[] urls = getClassPath();
			ClassLoader cl = URLClassLoader.newInstance(urls, classLoader);
			Thread.currentThread().setContextClassLoader(cl);

		} catch (MalformedURLException e) {
			throw new IllegalStateException(e);
		}

	}

	public MyGwtRunner(Class<?> clazz) throws Throwable {
		super(clazz);
	}

	private static URL[] getClassPath() throws MalformedURLException {
		String classPath = System.getProperty("java.class.path");
		String pathSeparator = System.getProperty("path.separator");
		String[] array = classPath.split(pathSeparator);

		List<URL> files = new ArrayList<URL>();
		for (String a : array) {
			files.add(new File(a).toURI().toURL());
		}

		return files.toArray(new URL[files.size()]);
	}
}
