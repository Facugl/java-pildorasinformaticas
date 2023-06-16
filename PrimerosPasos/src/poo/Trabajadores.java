package poo;

public interface Trabajadores {
	// Por convencion no ponemos public abstract
	double establece_bonus(double gratificacion);
	// Se pone en cursvia porque por defecto las variables son static, ademas de final
	double bonus_base = 1500;
}
