package com.tiny77.sort.aspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import com.tiny77.sort.itf.Sortor;

/**
 * 
 * @author qinrongjin
 *
 */
public class SortHandler implements InvocationHandler {
	
	private Sortor sortor;
	
	private DecimalFormat format = new DecimalFormat("########0.00000");

	public SortHandler(Sortor sortor) {
		super();
		this.sortor = sortor;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long time = System.currentTimeMillis();
		Object obj = method.invoke(sortor, args);
		time = System.currentTimeMillis() - time;
		if(method.getName().equals("sort"))
		System.out.println(sortor.getSortName() + ":执行时间：" + getTimeScribe(time));
		return obj;
	}

	private String getTimeScribe(long time) {
		if(time > 6000) {
			double d = time/60d;
			return format.format(d).toString() + " s";
		}else {
			return time + "ms";
		}
	}

}
