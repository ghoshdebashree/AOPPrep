package com.AOPPractice.AOPPrep;


import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

        @Pointcut("execution(* com.AOPPractice.AOPPrep.data.*.*(..))")
        public void dataLayerPointcut() {}

        @Pointcut("execution(* com.AOPPractice.AOPPrep.business.*.*(..))")
        public void businessLayerPointcut() {}

        //to intercept method calls for both layers:
        @Pointcut("com.AOPPractice.AOPPrep.aspect.JoinPointConfig.dataLayerPointcut() || "
                + "com.AOPPractice.AOPPrep.aspect.JoinPointConfig.businessLayerPointcut()")
        public void allLayersPointcut() {}

        //for a particular bean
        @Pointcut("bean(movie*)")
        public void movieBeanPointcut() {}
    }

