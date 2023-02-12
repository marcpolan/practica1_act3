public class Corona {
	Cercle interior;
	Cercle exterior;

	Corona (Cercle cint, Cercle cext) {
		interior=cint;
		exterior=cext;
	}

	double area() {
		return exterior.area()-interior.area();
	}

}
