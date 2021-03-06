package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

/**
 * @author wangl
 * @date 2020/11/18
 */
public class DivImpl implements Calculator {

    @Override
    public BigDecimal cal(BigDecimal numA, BigDecimal numB) {
        //除法计算
        return numA.divide(numB);
    }
}
