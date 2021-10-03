package com.zx.springcloudalibabasentinelzxdemo.manager;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-19 09:42
 **/
public class SentinelLocal {
    private static String resourceName = "hello world";


    public static void main(String[] args) throws InterruptedException {
//        initFlowRule();
//
//        while(true){
//            try(Entry entry = SphU.entry(resourceName)){
//                System.out.println(resourceName);
//            }catch (BlockException e) {
//                System.out.println("refused");
//            }
//        }

    }

    private static void initFlowRule(){
//        List<FlowRule> flowRules = new ArrayList<>();
//        FlowRule flowRule = new FlowRule();
//        flowRule.setResource(resourceName);
//        flowRule.setCount(20);
//        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        flowRules.add(flowRule);
//        FlowRuleManager.loadRules(flowRules);
    }

}
