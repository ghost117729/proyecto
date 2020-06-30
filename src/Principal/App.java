package Principal;

import controlador.gestionBatallon;
import controlador.gestionCaballosmilitares;
import controlador.gestionCursosmilitares;
import controlador.gestionEquipoMilitar;
import controlador.gestionEscuadron;
import controlador.gestionOficiales;
import controlador.gestionOperaciones;
import controlador.gestionPerrosMilitares;
import controlador.gestionSoldado;
import controlador.gestionTiposdearmas;
import controlador.gestionUbicacion;
import controlador.gestionVehiculosAereos;
import controlador.gestionVehiculosTerrestre;
import modelo.Soldado;
import modelo.Tiposdearmas;
import modelo.Ubicacion;
import modelo.VehiculosAereos;
import modelo.VehiculosTerrestre;
import modelo.Batallon;
import modelo.Caballosmilitares;
import modelo.Cursosmilitares;
import modelo.EquipoMilitar;
import modelo.Escuadron;
import modelo.Oficiales;
import modelo.Operaciones;
import modelo.PerrosMilitares;

public class App {
	static Soldado sol;
	static gestionSoldado gs;
	static gestionCaballosmilitares gs12;
	static gestionTiposdearmas gs8;
	static gestionBatallon gs1;
	static gestionCursosmilitares gs2;
	static gestionEquipoMilitar gs3;
	static gestionEscuadron gs4;
	static gestionOficiales gs5;
	static gestionOperaciones gs6;
	static gestionPerrosMilitares gs7;
	static gestionUbicacion gs9;
	static gestionVehiculosAereos gs10;
	static gestionVehiculosTerrestre gs11;
	static Batallon bat;
	static Caballosmilitares cab;
	static Cursosmilitares cur;
	static EquipoMilitar equ;
	static Escuadron esc;
	static Oficiales ofi;
	static PerrosMilitares per;
	static Operaciones ope;
	static Tiposdearmas arm;
	static Ubicacion ubi;
	static VehiculosAereos vae;
	static VehiculosTerrestre vet;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	bat= new Batallon ();
	bat.setIdbatallon(3);
	bat.setNombredelBatallon("Batallon 104");
	bat.setZonaMilitar("zona militar 26");
	bat.setNumerodeElementos(100);
	bat.setNumerodeVehiculos(50);
	bat.setEspecialidad("infanteria");
	
	cab= new Caballosmilitares ();
	cab.setIdcaballos(3);
	cab.setNombredecaballo("rey");
	cab.setRaza("frison");
	cab.setEspecialidad("entrenamiento");
	
	cur= new Cursosmilitares ();
	cur.setIdCursos(2);
	cur.setNombredeCurso("basico");
	cur.setDuraciondelCurso("6 meses");
	
	equ= new EquipoMilitar ();
	equ.setIdequipomilitar(1);
	equ.setTipodeCasco("mk");
	equ.setTipodeChaleco("IIA");
	equ.setTipodeBotas("filichan");
	equ.setTipodeUniforme("desertico");
	
	esc= new Escuadron ();
	esc.setNombredeEscuadron("fenix");
	esc.setSargento("Carlos");
	esc.setFusilero("Juan");
	esc.setGranadero("Marcos");
	esc.setAmetralladora("Charlie");
	esc.setRebastecedor("Diego");
	esc.setMedico("Jose");
	esc.setIdescuadron(2);
	
	ofi= new Oficiales ();
	ofi.setIdoficial(3);
	ofi.setNombreOficial("Marcelo");
	ofi.setRangodeOficial("teniente");
	ofi.setRamaMilitar("caballeria");
	
	ope= new Operaciones ();
	ope.setNombredeOperacion("marzo negro");
	ope.setUbicacion("culiacan");
	ope.setTipodeElementos("artilleria");
	ope.setCantidaddeElementos("50 elementos");
	ope.setIdoperaciones(2);
	
	per= new PerrosMilitares ();
	per.setIdperros(1);
	per.setNombredeperro("rocky");
	per.setRaza("labrador");
	per.setEspecialidad("rescastista");
	
	arm= new Tiposdearmas ();
	arm.setTipodeModelo("ak-47");
	arm.setTipodeMunicion("rasteadoras");
	arm.setTipodeAlcance("largo");
	arm.setTipodeCalibre("7 x 39 mm");
	arm.setIdarmas(2);
	
	ubi= new Ubicacion ();
	ubi.setEstado("morelos");
	ubi.setZonaMilitar("zona militar 13");
	ubi.setRegionMilitar("region v");
	ubi.setIdubicacion(1);
	
	vae= new VehiculosAereos ();
	vae.setAviondeAtaque("F-15E Strike Eagle");
	vae.setAviondeBombardero("Tu-160");
	vae.setAviondeTransporte(" KC-135 Stratotanker");
	vae.setAviondeReconocimiento(" E-2C Hawkeye ");
	vae.setAvionCaza("Su-27");
	vae.setIdvehiculosaereos(1);
	
	
	vet= new VehiculosTerrestre ();
	vet.setCamionesMilitares("Kynos Aljaba");
	vet.setCarrosdeCombate("AMX-30");
	vet.setCarrosBlindaos("Grizzly APC");
	vet.setCarrosMultiproposito("Kojak");
	vet.setIdterrestre(1);
	
		
	sol= new Soldado();
	sol.setNombre("Maria");
	sol.setApellidoP("Ocampo");
	sol.setApellidoM("Gomez");
	sol.setMatricula("jhgfdjhfdh");
	sol.setBatallon("Batallon 106");
	sol.setRamaMilitar("caballeria");
	sol.setEspecialidad("conductor");
	sol.setIdsoldado(3);
	
	
	
	
	
	gs = new gestionSoldado();
    //gs.crearSoldado(sol);
	//gs.editarSoldado(sol);
	//gs.eliminarSoldado("3");
	//gs.consultarSoldado("2");
	//gs.consultarSoldados();
	
	gs1= new gestionBatallon();
	//gs1.crearBatallon(bat);
    //gs1.editarBatallon(bat);
    //gs1.eliminarBatallon("3");
	//gs1.consultarBatallon("2");
	//gs1.consultarBatallones();
	
	  gs2 = new gestionCursosmilitares ();
	//gs2.crearCursosmilitares(cur);
	//gs2.editarCursosmilitares(cur);
	//gs2.eliminarCursosmilitares("3");
	//gs2.consultarCursomilitar("2");
	//gs2.consultarCursosmilitares();
	  
	  gs3 = new gestionEquipoMilitar ();
	//gs3.crearEquipoMilitar(equ);
	//gs3.editarEquipoMilitar(equ);
	//gs3.eliminarEquipoMilitar("3");
	//gs3.consultarEquipoMilitar("2");
	//gs3.consultarEquipoMilitares();
	
	  gs4 = new gestionEscuadron ();
	gs4.crearEscuadron(esc);
	//gs4.editarEscuadron(esc);
	//gs4.eliminarEscuadron("3");
	//gs4.consultarEscuadron("2");
	//gs4.consultarEscuadrones();
	
	  gs5 = new gestionOficiales ();
	//gs5.crearOficiales(ofi);
	//gs5.editarOficiales(ofi);
	//gs5.eliminarOficiales("3");
	//gs5.consultarOficial("2");
	//gs5.consultarOficiales();
	
	  gs6 = new gestionOperaciones ();
	//gs6.crearOperaciones(ope);
	//gs6.editarOperaciones(ope);
	//gs6.eliminarOperaciones("3");
	//gs6.consultarOperacion("2");
	//gs6.consultarOperaciones();
	
	
	  gs7 = new gestionPerrosMilitares ();
	//gs7.crearPerrosMilitares(per);
	//gs7.editarPerrosMilitares(per);
	//gs7.eliminarPerrosMilitares("3");
	//gs7.consultarPerrosMilitar("2");
	//gs7.consultarPerrosMilitares();
	
	  gs8 = new gestionTiposdearmas ();
	//gs8.crearTiposdearmas(arm);
	//gs8.editarTiposdearmas(arm);
	//gs8.eliminarTiposdearmas("3");
	//gs8.consultarTiposdearma("2");
	//gs8.consultarTiposdearmas();
	
	  gs9 = new gestionUbicacion ();
	//gs9.crearUbicacion(ubi);
	//gs9.editarUbicacion(ubi);
	//gs9.eliminarUbicacion("3");
	//gs9.consultarUbicacion("2");
	//gs9.consultarUbicaciones();
	
	  gs10 = new gestionVehiculosAereos ();
	//gs10.crearVehiculosAereos(vae);
	//gs10.editarVehiculosAereos(vae);
	//gs10.eliminarVehiculosAereos("3");
	//gs10.consultarVehiculoAereo("2");
	//gs10.consultarVehiculosAereos();
	
	  gs11 = new gestionVehiculosTerrestre ();
	//gs11.crearVehiculosTerrestre(vet);
	//gs11.editarVehiculosTerrestre(vet);
	//gs11.eliminarVehiculosTerrestre("3");
	//gs11.consultarVehiculoTerrestre("2");
	//gs11.consultarVehiculosTerrestre();
	
	  gs12 = new gestionCaballosmilitares ();
	//gs12.crearCaballosmilitares(cab);
	//gs12.editarCaballosmilitares(cab);
	//gs12.eliminarCaballosmilitares("3");
	//gs12.consultarCaballomilitar("2");
	//gs12.consultarCaballosmilitares();
}
}