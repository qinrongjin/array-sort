package com.tiny77.sort.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.tiny77.sort.aspect.SortHandler;
import com.tiny77.sort.itf.Sortor;

/**
 * 排序  工厂方法
 * @author qinrongjin
 *
 */
public class SortorFactory {

	/**
	 * 动态代理  创建对象  
	 * @param z
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Sortor getSortor(Class<? extends Sortor> z) throws InstantiationException, IllegalAccessException {
		InvocationHandler handler = new SortHandler(z.newInstance());
		Sortor sortor = (Sortor) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
				z.getInterfaces(), handler);
		return sortor;
	}
	
}
