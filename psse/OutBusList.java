package com.powerdata.openpa.psse;

import com.powerdata.openpa.tools.Complex;


public abstract class OutBusList extends PsseBaseList<OutBus>
{

	public OutBusList(PsseModel model) {super(model);}

	public abstract void updateVmag(int _ndx, float vm);
	public abstract void updateVang(int _ndx, float va);
	public abstract void updateVoltagte(int _ndx, Complex v);
	
	public BusList getInputList(){/*TODO:*/ return null;}
}