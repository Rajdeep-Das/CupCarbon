package action;

import cupcarbon.CupCarbon;
import device.SensorNode;
import radio_module.RadioModule;

public class CupActionAddRadioModule extends CupAction {	
	
	private SensorNode sensor;
	private RadioModule radioModule;
	
	public CupActionAddRadioModule(SensorNode sensor, RadioModule radioModule) {
		super();
		this.sensor = sensor;
		this.radioModule = radioModule;
	}

	@Override
	public void execute() {
		if(!CupCarbon.cupCarbonController.radioParamPane.isExpanded())
			CupCarbon.cupCarbonController.radioParamPane.setExpanded(true);
		radioModule.getSensorNode().setSelected(true);
		
		sensor.addRadioModule(radioModule);
	}

	@Override
	public void antiExecute() {
		if(!CupCarbon.cupCarbonController.radioParamPane.isExpanded())
			CupCarbon.cupCarbonController.radioParamPane.setExpanded(true);
		radioModule.getSensorNode().setSelected(true);
		
		sensor.removeRadioModule(radioModule);
	}

}
