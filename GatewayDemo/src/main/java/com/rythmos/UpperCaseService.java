package com.rythmos;

import java.util.concurrent.Future;

public interface UpperCaseService {
	
	public Future<String> translate(String str);

}
