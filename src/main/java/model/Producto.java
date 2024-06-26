package model;


public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int categoriaId;

    public Producto(int id, String nombre, double precio, String codigoBarras, double precioVenta, int categoriaId, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoriaId = categoriaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

	public Object getCantidadStock() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Estado() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getCodigoBarras() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
