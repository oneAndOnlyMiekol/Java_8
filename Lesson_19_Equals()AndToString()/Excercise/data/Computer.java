package data;

public class Computer {

	private String producer;
	private int model;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	public Computer(String producer, int model) {
		setProducer(producer);
		setModel(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Computer)) {
			return false;
		}
		Computer temp = (Computer) obj;
		if ( (this.getProducer() == temp.getProducer()) && (this.getModel() == temp.getModel()) ) {
			return true;
		}
		if(this.getProducer()!=null) {
			if(!this.getProducer().equals(temp.getProducer())) {
				return false;
			}
		}else if(this.getProducer()==null&&temp.getProducer()!=null) {
			return false;
		}
		if(this.getModel()!=temp.getModel()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Producer: " + getProducer() + ", Model: " + getModel();
	}

}
