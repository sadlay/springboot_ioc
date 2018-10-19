package com.lay.ioc.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataBaseConditional implements Condition{
	/**
	 * 数据库装配条件
	 * 
	 * @param context 条件上下文
	 * @param metadata 注释类型的元数据
	 * @return true 装配bean，否则不装配
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return false;
	}

}
