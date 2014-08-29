package com.powerdata.openpa;

import com.powerdata.openpa.Gen.Mode;
import com.powerdata.openpa.Gen.Type;

public interface GenList extends OneTermDevListIfc<Gen>
{
	Type getType(int ndx) throws PAModelException;
	
	void setType(int ndx, Type t) throws PAModelException;

	Type[] getType() throws PAModelException;
	
	void setType(Type[] t) throws PAModelException;
	
	Mode getMode(int ndx) throws PAModelException;

	void setMode(int ndx, Mode m)throws PAModelException;
	
	Mode[] getMode()throws PAModelException;
	
	void setMode(Mode[] m)throws PAModelException;

	float getOpMinP(int ndx)throws PAModelException;
	
	void setOpMinP(int ndx, float mw)throws PAModelException;
	
	float[] getOpMinP()throws PAModelException;
	
	void setOpMinP(float[] mw)throws PAModelException;

	float getOpMaxP(int ndx)throws PAModelException;

	void setOpMaxP(int ndx, float mw)throws PAModelException;

	float[] getOpMaxP()throws PAModelException;
	
	void setOpMaxP(float[] mw)throws PAModelException;

	float getMinQ(int ndx)throws PAModelException;

	void setMinQ(int ndx, float mvar)throws PAModelException;
	
	float[] getMinQ()throws PAModelException;
	
	void setMinQ(float[] mvar)throws PAModelException;

	float getMaxQ(int ndx)throws PAModelException;

	void setMaxQ(int ndx, float mvar)throws PAModelException;

	float[] getMaxQ()throws PAModelException;
	
	void setMaxQ(float[] mvar)throws PAModelException;

	float getPS(int ndx)throws PAModelException;

	void setPS(int ndx, float mw)throws PAModelException;
	
	float[] getPS()throws PAModelException;
	
	void setPS(float[] mw)throws PAModelException;

	float getQS(int ndx)throws PAModelException;

	void setQS(int ndx, float mvar)throws PAModelException;
	
	float[] getQS()throws PAModelException;
	
	void setQS(float[] mvar)throws PAModelException;

	boolean isRegKV(int ndx)throws PAModelException;

	void setRegKV(int ndx, boolean reg)throws PAModelException;
	
	boolean[] isRegKV()throws PAModelException;
	
	void setRegKV(boolean[] reg)throws PAModelException;

	float getVS(int ndx)throws PAModelException;

	void setVS(int ndx, float kv)throws PAModelException;
	
	float[] getVS()throws PAModelException;
	
	void setVS(float[] kv)throws PAModelException;

	void setRegBus(int ndx, Bus b)throws PAModelException;
	
	Bus getRegBus(int ndx) throws PAModelException;
	
	Bus[] getRegBus()throws PAModelException;
	
	void setRegBus(Bus[] b)throws PAModelException;
}