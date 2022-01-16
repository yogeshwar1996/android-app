package com.example.chdbuses;

import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.app.*;
import android.view.*;
import java.util.*;
import android.widget.SearchView.OnQueryTextListener;

public class Buses extends ListActivity {
	String place;
	
	String[] places = { "Bus 1A", "Bus 1C", "Bus 2A", "Bus 2C", "Bus 2B",
			"Bus 2D", "Bus 2E", "Bus 2F", "Bus 3A", "Bus 3C", "Bus 4A",
			"Bus 4C", "Bus 5A", "Bus 5C", "Bus 6A", "Bus 6C", "Bus 7A",
			"Bus 7C", "Bus 8A", "Bus 9A", "Bus 9C", "Bus 10A", "Bus 10",
			"Bus 11A", "Bus 11C", "Bus 12A", "Bus 12C", "Bus 13A", "Bus 13C",
			"Bus 14A", "Bus 14C", "Bus 15A", "Bus 15C", "Bus 17", "Bus 18",
			"Bus 18A","Bus 19", "Bus 19A", "Bus 20", "Bus 20/78", "Bus 22", "Bus 23A",
			"Bus 24A", "Bus 24C", "Bus 25", "Bus 26", "Bus 27", "Bus 28",
			"Bus 28A", "Bus 28C", "Bus 29", "Bus 30", "Bus 30A", "Bus 30B",
			"Bus 32", "Bus 32A", "Bus 35", "Bus 35A", "Bus 35B", "Bus 37",
			"Bus 39", "Bus 40", "Bus 45", "Bus 53", "Bus 71", "Bus 79",
			"Bus 85", "Bus 123", "Bus 126-2", "Bus 132", "Bus 143", "Bus 201",
			"Bus 202", "Bus 203", "Bus 205", "Bus 206A", "Bus 207", "Bus 208",
			"Bus 210", "Bus 211", "Bus 212", "Bus 213", "Bus 214", "Bus 216",
			"Bus 239", "Bus 240", "Bus 241", "Bus 242", "Bus 252", "Bus 254"

	};//
	int[] images = { R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus,
			R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus, R.drawable.bus

	};

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buses);
		CustomAdapter adapter = new CustomAdapter(this, places, images);
		setListAdapter(adapter);
	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(this, l.getItemAtPosition(position).toString(),
				Toast.LENGTH_SHORT).show();
		place = l.getItemAtPosition(position).toString();

		switch (place) {
		case "Bus 1A":
			Intent bus_stand_ = new Intent(Buses.this, Bus1A.class);

			Buses.this.startActivity(bus_stand_);
			break;
		case "Bus 1C":
			Intent bus_stand = new Intent(Buses.this, Bus1C.class);
			Buses.this.startActivity(bus_stand);
			break;

		case "Bus 2A":
			Intent Tur = new Intent(Buses.this, Bus2A.class);
			Buses.this.startActivity(Tur);
			break;
		case "Bus 2B":
			Intent Turo = new Intent(Buses.this, Bus2B.class);
			Buses.this.startActivity(Turo);
			break;
		case "Bus 2C":
			Intent TurK = new Intent(Buses.this, Bus2C.class);
			Buses.this.startActivity(TurK);
			break;
		case "Bus 2D":
			Intent TurKe = new Intent(Buses.this, Bus2D.class);
			Buses.this.startActivity(TurKe);
			break;
		case "Bus 2E":
			Intent Tu = new Intent(Buses.this, Bus2E.class);
			Buses.this.startActivity(Tu);
			break;
		case "Bus 2F":
			Intent Tr = new Intent(Buses.this, Bus2F.class);
			Buses.this.startActivity(Tr);
			break;
		case "Bus 3A":
			Intent tt = new Intent(Buses.this, Bus3A.class);
			Buses.this.startActivity(tt);
			break;		
			case "Bus 3C":
				Intent ttt = new Intent(Buses.this, Bus3C.class);
				Buses.this.startActivity(ttt);
				break;
			case "Bus 4A":
				Intent fa = new Intent(Buses.this, Bus4A.class);
				Buses.this.startActivity(fa);
				break;		
				case "Bus 4C":
					Intent fb = new Intent(Buses.this, Bus4C.class);
					Buses.this.startActivity(fb);
					break;
				case "Bus 5A":
					Intent faf = new Intent(Buses.this, Bus5A.class);
					Buses.this.startActivity(faf);
					break;		
					case "Bus 5C":
						Intent fbf = new Intent(Buses.this, Bus5C.class);
						Buses.this.startActivity(fbf);
						break;
					case "Bus 6A":
						Intent fafy = new Intent(Buses.this, Bus6A.class);
						Buses.this.startActivity(fafy);
						break;		
						case "Bus 6C":
							Intent fbfb = new Intent(Buses.this, Bus6C.class);
							Buses.this.startActivity(fbfb);
							break;
						case "Bus 7A":
							Intent of = new Intent(Buses.this, Bus7A.class);
							Buses.this.startActivity(of);
							break;		
							case "Bus 7C":
								Intent ob = new Intent(Buses.this, Bus7C.class);
								Buses.this.startActivity(ob);
								break;
							case "Bus 9A":
								Intent ofo = new Intent(Buses.this, Bus9A.class);
								Buses.this.startActivity(ofo);
								break;		
								case "Bus 9C":
									Intent obo = new Intent(Buses.this, Bus9C.class);
									Buses.this.startActivity(obo);
									break;
								case "Bus 8A":
									Intent ie = new Intent(Buses.this, Bus8A.class);
									Buses.this.startActivity(ie);
									break;		
								case "Bus 10A":
									Intent q = new Intent(Buses.this, Bus10A.class);
									Buses.this.startActivity(q);
									break;		
									case "Bus 10":
										Intent qw = new Intent(Buses.this, Bus10C.class);
										Buses.this.startActivity(qw);
										break;
									case "Bus 11A":
										Intent we = new Intent(Buses.this, Bus11A.class);
										Buses.this.startActivity(we);
										break;		
										case "Bus 11C":
											Intent ew = new Intent(Buses.this, Bus11C.class);
											Buses.this.startActivity(ew);
											break;
										case "Bus 12A":
											Intent qs = new Intent(Buses.this, Bus12A.class);
											Buses.this.startActivity(qs);
											break;		
					case "Bus 12C":
						Intent qd = new Intent(Buses.this, Bus12C.class);
						Buses.this.startActivity(qd);
						break;
					case "Bus 13A":
						Intent po = new Intent(Buses.this, Bus13A.class);
						Buses.this.startActivity(po);
						break;		
						case "Bus 13C":
							Intent oo = new Intent(Buses.this, Bus13C.class);
							Buses.this.startActivity(oo);
							break;
						case "Bus 14A":
							Intent cd = new Intent(Buses.this, Bus14A.class);
							Buses.this.startActivity(cd);
							break;		
							case "Bus 14C":
								Intent fd = new Intent(Buses.this, Bus14C.class);
								Buses.this.startActivity(fd);
								break;
							case "Bus 15A":
								Intent ld = new Intent(Buses.this, Bus15A.class);
								Buses.this.startActivity(ld);
								break;		
								case "Bus 15C":
									Intent oto = new Intent(Buses.this, Bus15C.class);
									Buses.this.startActivity(oto);
									break;
						
								case "Bus 18":
									Intent ud = new Intent(Buses.this, Bus18.class);
									Buses.this.startActivity(ud);
									break;		
									case "Bus 18A":
										Intent ui = new Intent(Buses.this, Bus18A.class);
										Buses.this.startActivity(ui);
										break;
									case "Bus 19":
										Intent pp = new Intent(Buses.this, Bus19.class);
										Buses.this.startActivity(pp);
										break;
									case "Bus 19A":
										Intent vi = new Intent(Buses.this, Bus19A.class);
										Buses.this.startActivity(vi);
										break;
										case "Bus 20":
											Intent oio = new Intent(Buses.this,Bus20.class);
											Buses.this.startActivity(oio);
											break;
										case "Bus 20/78":
											Intent fh = new Intent(Buses.this, Bus20_78.class);
											Buses.this.startActivity(fh);
											break;		
											case "Bus 22":
												Intent ap = new Intent(Buses.this, Bus22.class);
												Buses.this.startActivity(ap);
												break;
											case "Bus 23A":
												Intent eie = new Intent(Buses.this, Bus23A.class);
												Buses.this.startActivity(eie);
												break;		
												case "Bus 24A":
													Intent oho = new Intent(Buses.this, Bus24A.class);
													Buses.this.startActivity(oho);
													break;
												case "Bus 24C":
													Intent cdc = new Intent(Buses.this, Bus24A.class);
													Buses.this.startActivity(cdc);
													break;		
													case "Bus 25":
														Intent fds = new Intent(Buses.this, Bus25.class);
														Buses.this.startActivity(fds);
														break;
						case "Bus 26":
							Intent ldl = new Intent(Buses.this, Bus25.class);
							Buses.this.startActivity(ldl);
							break;		
							case "Bus 27":
								Intent otod = new Intent(Buses.this, Bus27.class);
								Buses.this.startActivity(otod);
								break;
					
							case "Bus 28":
								Intent udu = new Intent(Buses.this, Bus28.class);
								Buses.this.startActivity(udu);
								break;		
								case "Bus 28A":
									Intent uie = new Intent(Buses.this, Bus28A.class);
									Buses.this.startActivity(uie);
									break;
								case "Bus 28C":
									Intent ppq = new Intent(Buses.this, Bus28C.class);
									Buses.this.startActivity(ppq);
									break;
								case "Bus 29":
									Intent viv = new Intent(Buses.this, Bus29.class);
									Buses.this.startActivity(viv);
									break;
									case "Bus 30":
										Intent oioq = new Intent(Buses.this,Bus30.class);
										Buses.this.startActivity(oioq);
										break;
									case "Bus 30A":
										Intent oioqw = new Intent(Buses.this,Bus30A.class);
										Buses.this.startActivity(oioqw);
										break;
									case "Bus 30B":
										Intent oioqwq = new Intent(Buses.this,Bus30B.class);
										Buses.this.startActivity(oioqwq);
										break;
									case "Bus 32":
										Intent xds = new Intent(Buses.this, Bus32.class);
										Buses.this.startActivity(xds);
										break;	
									case "Bus 32A":
										Intent fdsd = new Intent(Buses.this, Bus32A.class);
										Buses.this.startActivity(fdsd);
										break;
									case "Bus 35":
										Intent d_ = new Intent(Buses.this, Bus35.class);

										Buses.this.startActivity(d_);
										break;
									case "Bus 35A":
										Intent bp= new Intent(Buses.this, Bus35A.class);
										Buses.this.startActivity(bp);
										break;

									case "Bus 35B":
										Intent lr = new Intent(Buses.this, Bus35B.class);
										Buses.this.startActivity(lr);
										break;
									case "Bus 37":
										Intent ko = new Intent(Buses.this, Bus37.class);
										Buses.this.startActivity(ko);
										break;
									case "Bus 39":
										Intent gg = new Intent(Buses.this, Bus39.class);
										Buses.this.startActivity(gg);
										break;
									case "Bus 40":
										Intent dgg = new Intent(Buses.this, Bus40.class);
										Buses.this.startActivity(dgg);
										break;
										case "Bus 45":
											Intent ggd = new Intent(Buses.this, Bus45.class);
											Buses.this.startActivity(ggd);
											break;
										case "Bus 53":
											Intent gge = new Intent(Buses.this, Bus53.class);
											Buses.this.startActivity(gge);
											break;
										case "Bus 71":
											Intent gwd = new Intent(Buses.this, Bus71.class);
											Buses.this.startActivity(gwd);
											break;
										case "Bus 79":
											Intent re = new Intent(Buses.this, Bus79.class);
											Buses.this.startActivity(re);
											break;
										case "Bus 85":
											Intent rer = new Intent(Buses.this, Bus85.class);
											Buses.this.startActivity(rer);
											break;
										case "Bus 123":
											Intent cf = new Intent(Buses.this, Bus123.class);
											Buses.this.startActivity(cf);
											break;
										case "Bus 126-2":
											Intent kl = new Intent(Buses.this, Bus126.class);
											Buses.this.startActivity(kl);
											break;
										case "Bus 132":
											Intent cfs = new Intent(Buses.this, Bus132.class);
											Buses.this.startActivity(cfs);
											break;
										case "Bus 143":
											Intent cfc = new Intent(Buses.this, Bus143.class);
											Buses.this.startActivity(cfc);
											break;
										case "Bus 201":
											Intent cdf = new Intent(Buses.this, Bus201.class);
											Buses.this.startActivity(cdf);
											break;
										case "Bus 202":
											Intent cdfe = new Intent(Buses.this, Bus202.class);
											Buses.this.startActivity(cdfe);
											break;
										case "Bus 203":
											Intent cdfw = new Intent(Buses.this, Bus203.class);
											Buses.this.startActivity(cdfw);
											break;
										case "Bus 205":
											Intent cdff = new Intent(Buses.this, Bus205.class);
											Buses.this.startActivity(cdff);
											break;
										case "Bus 206A":
											Intent cdfz = new Intent(Buses.this, Bus206A.class);
											Buses.this.startActivity(cdfz);
											break;
										case "Bus 207":
											Intent cdfs = new Intent(Buses.this, Bus207.class);
											Buses.this.startActivity(cdfs);
											break;
										case "Bus 208":
											Intent cdfx = new Intent(Buses.this, Bus208.class);
											Buses.this.startActivity(cdfx);
											break;
									/*"Bus 210", "Bus 211", "Bus 212", "Bus 213", "Bus 214", "Bus 216",
			"Bus 239", "Bus 240", "Bus 241", "Bus 242", "Bus 252", "Bus 254",*/
										case "Bus 210":
											Intent cvb = new Intent(Buses.this, Bus210.class);
											Buses.this.startActivity(cvb);
											break;
										case "Bus 211":
											Intent pap = new Intent(Buses.this, Bus211.class);
											Buses.this.startActivity(pap);
											break;
										case "Bus 212":
											Intent ljk = new Intent(Buses.this, Bus212.class);
											Buses.this.startActivity(ljk);
											break;
										case "Bus 213":
											Intent cz = new Intent(Buses.this, Bus213.class);
											Buses.this.startActivity(cz);
											break;
										case "Bus 214":
											Intent fgd = new Intent(Buses.this, Bus214.class);
											Buses.this.startActivity(fgd);
											break;
										case "Bus 216":
											Intent cze = new Intent(Buses.this, Bus216.class);
											Buses.this.startActivity(cze);
											break;
										case "Bus 239":
											Intent yiu = new Intent(Buses.this, Bus239.class);
											Buses.this.startActivity(yiu);
											break;
										case "Bus 240":
											Intent cvz = new Intent(Buses.this, Bus240.class);
											Buses.this.startActivity(cvz);
											break;
										case "Bus 241":
											Intent yiuv = new Intent(Buses.this, Bus241.class);
											Buses.this.startActivity(yiuv);
											break;
										case "Bus 242":
											Intent cvza = new Intent(Buses.this, Bus242.class);
											Buses.this.startActivity(cvza);
											break;
										case "Bus 252":
											Intent yikuv = new Intent(Buses.this, Bus252.class);
											Buses.this.startActivity(yikuv);
											break;
										case "Bus 254":
											Intent clvza = new Intent(Buses.this, Bus254.class);
											Buses.this.startActivity(clvza);
											break;
										default:
			System.out.println("wrong Choice");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}