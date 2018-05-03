package com.valwen.regularexpression;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.regex.*;

/**
 * 
 * @author wen
 *
 */
public class RegularExpression {
	
    /**
     * 
     * @param args 
     */
	public static void main(String[] args)
	{
		System.out.println(REJudge.isMatchChineseNameFormat("Œ 1Œ "));
        REJudge.isMatchQQFormat("");
		//Point2D po=new Point(1,1);
	}

}
