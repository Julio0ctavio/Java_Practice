package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ModelismBrands { 
	private String name, scales, origin, owner;

	public ModelismBrands(String name, String scales, String origin, String owner) {
		this.name = name;
		this.scales = scales;
		this.origin = origin;
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScales() {
		return scales;
	}

	public void setScales(String scales) {
		this.scales = scales;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "\t-> ModelismBrands [name=" + name + ", scales=" + scales + ", origin=" + origin + "]\n\t";
	}
}


public class StreamMap {
	public static void main(String[] args) {
		List<ModelismBrands> brands = Arrays.asList(new ModelismBrands("Bachmann Industries", "HO, O, N, G", "USA", "Kader Group, Hong Kong"), 
				new ModelismBrands("Atlas Model Railroad", "HO, O, N", "USA", "Atlas Model Railroad Company Inc, USA"),
				new ModelismBrands("Wm. K. Walthers", "HO, O, N", "USA", "Walthers Inc, USA"), 
				new ModelismBrands("Kato Precision Railroad Models", "HO, N", "Japan", "Yuji Kato, Japan"));
		
		List<String> common_brands = brands.stream().map(b -> b.getName()).collect(Collectors.toList());
		System.out.println("Hey there, these are the most common brands you will find in the market about railroad modelism: \n");
		for (String brand : common_brands) {
			System.out.println("* " + brand);
		}
	}
}
