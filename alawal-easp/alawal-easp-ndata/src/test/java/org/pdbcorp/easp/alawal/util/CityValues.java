/*
 * Copyright 2020 PDB Corp.
 *
 * Proprietary Software built off of open-source software?
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pdbcorp.easp.alawal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author jaradat-pdb
 */
public class CityValues {

	private static final String[] values = {"New Orleans", "Brighton", "Bridgeport", "Anchorage", "Hamilton", "Ashland", "Chicago",
			"San Jose", "Sioux Falls", "Baltimore", "Kulpsville", "Middle Island", "Los Angeles", "Chagrin Falls", "Laredo", "Phoenix",
			"Mc Minnville", "Milwaukee", "Taylor", "Rockford", "Aston", "Irving", "Albany", "Middlesex", "Stevens Point", "Shawnee",
			"Easton", "New York", "Conroe", "Columbus", "Las Cruces", "Ridgefield Park", "Dunellen", "Metairie", "Camarillo", "San Antonio",
			"Abilene", "Prineville", "Overland Park", "Fairbanks", "Miami", "Hopkins", "Boston", "Madison", "Philadelphia", "Tullahoma",
			"Columbia", "Wayne", "Flemington", "Westbury", "Jenkintown", "Van Nuys", "Providence", "Huntingdon Valley", "Monroe Township",
			"Austin", "Littleton", "Erie", "Glen Burnie", "Boise", "San Francisco", "Chapel Hill", "San Carlos", "Concord", "London", "Wellsville",
			"Newark", "Clovis", "Staten Island", "Jacksonville", "Hayward", "Beachwood", "Euless", "Gardena", "Evanston", "Akron", "Burlingame",
			"San Gabriel", "Waco", "San Leandro", "Indianapolis", "Rock Springs", "Mc Lean", "Boulder", "Honolulu", "Burnsville", "High Point",
			"Lynbrook", "Portland", "Beloit", "Worcester", "Mesquite", "Paterson", "Homestead", "Owings Mills", "Thousand Oaks", "Hackensack",
			"Ontario", "Oakland", "Troy", "Clarks Summit", "Orange", "Pittstown", "Cocoa", "Bronx", "Pearl City", "Denver", "Rockaway", "Absecon",
			"Middleboro", "Dallas", "Findlay", "Riverside", "Nashville", "Preston", "Beverly Hills", "Massapequa", "Atlantic City", "Cincinnati",
			"Smithfield", "Syracuse", "Cherry Hill", "Garden City", "Little Rock", "Saint Paul", "Houma", "Ronkonkoma", "Sacramento", "Round Rock",
			"Reno", "Wheeling", "Randolph", "Spartanburg", "Hampstead", "Mount Vernon", "Berkeley", "Paramus", "Oakley", "Cedar Grove", "Perrysburg", "Homosassa",
			"Santa Clara", "Hazleton", "Jersey City", "San Ramon", "Bridgewater", "Bohemia", "Somerville", "Beaverton", "Salem", "Riverton", "Douglasville", "Bangor",
			"Kennedale", "Buffalo", "Opa Locka", "Crestview", "South San Francisco", "Northridge", "Lafayette", "Dearborn", "Vashon", "Coatesville", "Rohnert Park",
			"Orlando", "Escondido", "Westborough", "El Monte", "Yonkers", "Biloxi", "Ramsey", "Ann Arbor", "Deer Park", "Canton", "New Haven", "Fairfax", "Wilmington",
			"Toledo", "Tacoma", "Roseville", "Warren", "Richboro", "Tampa", "El Cajon", "College Station", "Highland Park", "Brooklyn", "Saint Louis", "Stockton",
			"Little Falls", "Seattle", "Burlington", "Hays", "Minneapolis", "Santa Rosa", "Palatine", "Costa Mesa", "Bothell", "Strongsville", "Plaistow",
			"Satellite Beach", "Huntington Beach", "Southfield", "Wichita Falls", "North Haven", "Aberdeen", "Richmond", "Southampton", "Shakopee", "Somerset",
			"Fargo", "Carson City", "Scottsdale", "Salisbury", "Amarillo", "La Mesa", "Atlanta", "Niles", "Fairfield", "Valley Park", "Arlington", "Cathedral City",
			"Lansing", "Clinton", "York", "Butte", "Livingston", "Waterford", "Cleveland", "Fort Worth", "Lancaster", "Johnston", "Hialeah", "Pomona", "Trion",
			"Broussard", "Nutley", "Vestal", "Passaic", "Moscow", "North Attleboro", "Rochester", "Green Bay", "Colorado Springs", "Hyattsville", "New Bedford", "Hanover",
			"Peoria", "Bucyrus", "Kent", "Bloomington", "Arlington Heights", "Brandon", "El Paso", "Bladensburg", "Anaheim", "Greensboro", "Coram", "Lyndhurst", "Memphis",
			"Pacifica", "Long Island City", "Northfield", "Norwalk", "Fort Wayne", "Meridian", "Sterling Heights", "Scranton", "Oroville", "Port Jervis", "Brook Park",
			"Bloomfield", "Des Moines", "King of Prussia", "Raleigh", "Richland", "Pelham", "Parkville", "Hicksville", "Tulsa", "Muskegon", "Bowling Green", "Kearny", "Barberton",
			"Englewood", "Grand Rapids", "Pearl", "Pasadena", "Astoria", "Bellflower", "Toms River", "Denville", "Newport News", "Oak Hill", "San Diego", "San Bernardino",
			"Cambridge", "Harrisburg", "Mesa", "Lake Worth", "Milan", "Clifton", "Union City", "Moss", "Santa Ana", "Rolling Meadows", "Hatfield",
			"Whippany", "Salt Lake City", "Fayetteville", "East Lansing", "Utica", "South Bend", "Harrison", "Trenton", "Katonah", "Kerrville",
			"Elk Grove Village", "Freehold", "Omaha", "Annandale", "Plano", "Syosset", "Crystal River", "Fortville", "Saint Joseph", "Jackson", "Saratoga",
			"Longwood", "Cheyenne", "Old Forge", "Thousand Palms", "Margate City", "Daytona Beach", "Washington", "Novato", "Elkhart", "Alliance",
			"St. Stephens Ward", "Abbey Ward", "East Southbourne and Tuckton W", "Hawerby cum Beesby", "Greets Green and Lyng Ward", "Desborough", "Bargate Ward",
			"Chirton Ward", "Staple Hill Ward", "Parwich", "Loundsley Green Ward", "Dee Ward", "Broxburn, Uphall and Winchburg", "Weston-Super-Mare", "Carbrooke",
			"New Milton", "Parkham", "Darnall Ward", "Marldon", "Prestatyn Community", "Lye and Stourbridge North Ward", "Warlingham", "Newport", "Chichester",
			"Steornabhagh a Deas Ward", "South Ward", "Newquay", "Brimpton", "Shard End Ward", "Letchworth South West Ward", "Longhill Ward", "Franche Ward", "Whittington",
			"Cockerton West Ward", "Castle Ward", "Devizes", "Colnbrook with Poyle", "Aldridge Central and South War", "East Putney Ward", "Sawston",
			"Wakefield North Ward", "St. Enoder", "Ryde", "Laindon Park Ward", "Lymington and Pennington", "Aylesbury", "Burmantofts and Richmond Hill ", "Howard Town Ward",
			"Farnham", "Beeston West Ward", "Wollaton West Ward", "Llangeler Community", "Brockley Ward", "Meads Ward", "St. Ive", "Norton Canes", "Bulwell Ward",
			"Treorchy Community", "Maybury and Sheerwater Ward", "Westgate Ward", "Conisbrough and Denaby Ward", "Newbold and Brownsover Ward", "Middlewich",
			"St. Marys Ward", "Gresham Ward", "Aldborough Ward", "Royal Hospital Ward", "Woodstock Ward", "Dunblane and Bridge of Allan W", "Kempshott Ward",
			"City and Hunslet Ward", "Ruckinge", "Abbey Road Ward", "Prittlewell Ward", "Kirkby Stephen", "Eaton Park Ward", "Bishop Auckland", "Falmouth",
			"Malmesbury", "West End Ward", "Town Ward", "Crompton Ward", "Stroud", "Overton Ward", "Midway Ward", "Washington East Ward", "Walkergate Ward",
			"Stratfield Mortimer", "Selston", "Govan Ward", "Millwall Ward", "Sefton", "Lancing", "St. Gluvias", "Hilton", "Brooklands Ward", "Eccleston Ward",
			"St. Georges Hill Ward", "Launcells", "Renfrew South and Gallowhill War", "Astley Bridge Ward", "Shiney Row Ward", "Bintree", "Woodhall Farm Ward", "Stanhope",
			"North Tawton", "Catterick", "Kilmersdon", "Central Ward", "Filwood Ward", "Central Buchan Ward", "Smallbridge and Firgrove Ward", "Lavenham", "Saffron Walden",
			"Cilybebyll Community", "Birchington", "Forth Ward", "Belvedere Ward", "Acton Central Ward", "Walton Ward", "Caversham Ward", "Abingdon on Thames", "Northgate Ward",
			"Tynemouth Ward", "Eccleshall", "Linlithgow Ward", "Layton Ward", "Blackheath Westcombe Ward", "Moulsham and Central Ward", "Great Dunmow", "Gweek", "Stretford Ward",
			"Orsett Ward", "Hatton", "Barrowford", "Bellingham", "George St", "South Jesmond Ward", "Barlow", "St. Johns Ward", "Bodmin", "Knightsbridge and Belgravia Wa",
			"Elgin City South Ward", "Halstead", "Fawley", "Hartshill", "Kensington and Fairfield Ward", "West Bromwich Central Ward", "Rowley Ward", "Sutton Trinity Ward",
			"Shepway South Ward", "Everton Ward", "Heaton Ward", "Gillingham North Ward", "Bangor Community", "Butterwick", "Deepdale Ward", "Walney North Ward", "Scarcroft",
			"Penryn", "Tenterden", "Haverstock Ward", "Kilpatrick Ward", "Astley Mosley Common Ward", "St. Peters Ward", "Cyfarthfa Community", "Baguley Ward",
			"Crawcrook and Greenside Ward", "Southey Ward", "Trossachs and Teith Ward", "Chapel-en-le-Frith", "Kings Norton Ward", "Mid and Upper Nithsdale Ward",
			"Amersham", "North Heywood Ward", "Little Hereford", "Canning Town North Ward", "Springfield Ward", "Bontnewydd Community", "Sheviock", "Peterlee", "Shrub End Ward",
			"Twickenham Riverside Ward", "Coleshill", "Crystal Palace Ward", "Bowes", "Halliwell Ward", "Wareham St. Martin", "Finedon", "Caerphilly Community",
			"Old Newton with Dagworth", "Crowle and Ealand", "Milton Regis Ward", "St. Michaels and Wicksteed War", "Howe of Fife and Tay Coast War", "Shipston on Stour",
			"Strood South Ward", "Newton-with-Clifton", "Llanelli Rural Community", "Newington Ward", "Much Wenlock", "Churchdown", "Werrington South Ward", "Hollington Ward",
			"Northfleet South Ward", "Steyning", "Holbrook Ward", "Woodhouse Ward", "Keighley", "Deal", "Heanor and Loscoe", "North Horsham", "Hickling",
			"Edmonton Green Ward", "Harefield Ward", "Moulsecoomb and Bevendean Ward", "Horfield Ward", "Cleator Moor", "Penmaenmawr Community", "Parsons Green and Walham Ward",
			"Cressington Ward", "Uckfield", "Acton Trussell and Bednall", "Denwick", "Beaminster", "Hereford", "Loughborough Ashby Ward", "Wimbledon Park Ward", "Hyde Werneth Ward",
			"Darton West Ward", "Rock", "Soho Ward", "Oakridge and Castlefield Ward", "Irvine East Ward", "Springfields and Trent Vale Wa", "Ise Lodge Ward", "Tatsfield", "Kings Hill",
			"Childs Hill Ward", "Little Ness", "Goldsmid Ward", "Cherryfield Ward", "Wakefield East Ward", "Nith Ward", "Holywell Community", "Lamport", "Chadderton Central Ward",
			"Penge and Cator Ward", "Warminster", "Redhill Ward", "East Kilbride West Ward", "Tiffield", "Londesborough", "Whitchurch Urban", "Ponteland", "Appleton Wiske",
			"Barnham", "Stutton with Hazlewood", "Holyrood Ward", "East Sheen Ward", "Byker Ward", "Llangristiolus Community", "Neilston, Uplawmoor and Newton",
			"Little Parndon and Hare Street", "Read", "Blantyre Ward", "Kirk Hammerton", "Custom House Ward", "Nonington", "Foleshill Ward", "West Wickham Ward",
			"Woodham Ward", "Wombourne", "Trowbridge", "St. Andrews Ward", "Pinhoe Ward", "Gaer Community", "Headley", "St. Margarets with St. Nichola", "Dunbar and East Linton Ward",
			"Bunhill Ward", "Chorlton Park Ward", "Edgeley and Cheadle Heath Ward", "Cotham Ward", "Greenlands Ward", "Boothen and Oak Hill Ward", "Stoneygate Ward",
			"Trelawnyd and Gwaenysgor Commu", "Cobham and Downside Ward", "Leighton-Linslade", "Hetton", "Hodge Hill Ward", "Little Clacton", "Aldbrough", "Coatbridge South Ward",
			"Redlands Ward", "St. Helier Ward", "Victoria Ward", "Wheatley Ward", "Windlesham", "Saint Annes on the Sea", "Sutton Vesey Ward", "Reydon", "Ruddington",
			"Kingston Bagpuize with Southmo", "Manor Castle Ward", "Shenley", "Pontefract North Ward", "Bellshill Ward", "Rhoose Community", "Grovehill Ward",
			"Sharston Ward", "Lobley Hill and Bensham Ward", "Tibberton", "Stretton", "Addlestone Bourneside Ward", "Chester-le-Street North and Ea", "Orford Ward",
			"Brympton", "Ashford Common Ward", "Hove Park Ward", "Clayton-le-Moors Ward", "Harrow Weald Ward", "Temple Newsam Ward", "Great Barr with Yew Tree Ward",
			"Barnfield Ward", "Calstock", "Little Missenden", "Tonge with the Haulgh Ward", "Berkhamsted", "Prestbury", "East Finchley Ward", "Lancaster Gate Ward",
			"Iwade", "Calton Ward", "Wilsden", "Llwyn-y-Pia Community", "Clackmannanshire South Ward", "Corporation Park Ward", "Cirencester", "Mossend and Holytown Ward",
			"Heath Town Ward", "Long Preston", "Seaham", "St. Austell", "Aveton Gifford", "Trotton with Chithurst", "Speke-Garston Ward", "Leatherhead South Ward",
			"Kirkintilloch East and Twechar", "Loughborough Hastings Ward", "Alphington Ward", "Woodford cum Membris", "Billesley Ward", "Milton Ward", "Mossley",
			"Dingwall and Seaforth Ward", "Broomhill Ward", "Frimley Green Ward", "Littleborough Lakeside Ward", "Girvan and South Carrick Ward", "Leigh-on-Sea", "Wonersh",
			"Stainburn", "Earlestown Ward", "Blyth", "Upper Rawcliffe-with-Tarnacre", "Northwood Ward", "Shrewsbury", "Empress Ward", "Hartburn Ward", "West Garioch Ward",
			"Roundway", "Castleford Central and Glassho", "Melton Dorian Ward", "Patching Hall Ward", "Sunningdale", "Leek", "Churchill Ward", "Aspley Ward", "Callington",
			"Ravenshead", "Church Langley Ward", "Midlothian West Ward", "Grangemouth Ward", "Rhos-on-Sea Community", "Kingswells", "Warwick", "Inverclyde South Ward",
			"Hamilton South Ward", "Kinross-shire Ward", "Daybrook Ward", "Ravensthorpe Ward", "Silloth-on-Solway", "Milton", "Llantrisant Community", "Lansdown Ward",
			"Fowlmere", "Audley Ward", "Warham", "Mildmay Ward", "Radcliffe West Ward", "Murdostoun Ward", "Eastbrook Ward", "Ipplepen", "Stowting", "Werrington",
			"Banchory and Mid Deeside Ward", "Madeley", "Kincorth", "Benwell and Scotswood Ward", "Rothwell Ward", "Markhouse Ward", "Stokenham", "High Barnet Ward",
			"Hexham", "Shorne", "Stannington Ward", "Market Rasen", "Tadworth and Walton Ward", "Moreton Morrell", "Launceston", "Henllan Community", "Glastonbury",
			"Thorpe Hamlet Ward", "Yalding", "Moordown Ward", "Over Kellet", "Staina Ward", "Portobello", "Brixham", "Windle Ward", "Newmarket", "Rainham South Ward",
			"Gwersyllt Community", "Walcot Ward", "Longford Ward", "Yealmpton", "Shiphay-with-the-Willows Ward", "Southam", "Almond Ward", "Hylands Ward", "Dormers Wells Ward",
			"Mortehoe", "Parr Ward", "Hucknall North Ward", "Kilbirnie and Beith Ward", "Liscard Ward", "Seven Sisters Ward", "Fareham South Ward", "Sutton cum Duckmanton",
			"Whitley Ward", "Shirley Ward", "Holbrook", "North East Ward", "Plymstock Dunstone Ward", "Batchwood Ward", "Salvington Ward", "Hailsham", "Park Ward",
			"Ballochmyle Ward", "Priory Heath Ward", "Farnworth Ward", "Inverness Ness-Side Ward", "Consett North ED", "Tanworth-in-Arden", "Windsor", "Alcida", "Belleville",
			"Vancouver", "LIle-Perrot", "Swift Current", "Baker Brook", "Delhi", "Bradford", "Aurora", "New Waterford", "North York", "Red Deer", "Edmonton", "Fredericton",
			"Etobicoke", "Barrie", "Calgary", "Pangman", "Rouyn-Noranda", "Leduc", "North Vancouver", "Pierrefonds", "Laval", "Yellowhead County", "Strathroy", "North River",
			"Ottawa", "Becancour", "Sault Ste. Marie", "Salmon Arm", "Vernon", "Saint-Hyacinthe", "Peterborough", "Quesnel", "Regina", "Matane", "Abbotsford", "Saint-Damien", "Miramichi",
			"Kitchener", "Mississauga", "Stoneham-Et-Tewkesbury", "Nanaimo", "Saint-Raymond", "St Catharines", "Quebec", "Arnprior", "Lloydminster", "Winnipeg", "St. Johns",
			"Montreal", "Carleton Place", "Toronto", "Kingston", "Thorold", "West Vancouver", "Lavaltrie", "Ajax", "Castlegar", "Lasalle", "Grand Manan", "Kanata", "Chicoutimi",
			"Paradise", "Ingersoll", "Saskatoon", "Otterburn Park", "Beloeil", "Napanee", "Newbridge", "Dieppe", "Sainte-Therese", "Sept-Iles", "Juniper", "Dartmouth", "Halifax",
			"Woodstock", "Scarborough", "Maple Ridge", "Saint-Paul", "Duncan", "Saint-Georges", "Kamloops", "Trois-Rivieres", "Stoney Creek", "Mount Pisgah", "Saint-Leonard",
			"Cowansville", "Mirabel", "Alma", "Keswick", "Orleans", "Unionville", "Richmond Hill", "Big Ridge", "Vaudreuil-Dorion", "Prince Albert", "Jonquiere", "Gray Rapids",
			"North Bay", "Oakville", "Gatineau", "Surrey", "Cantley", "Amherstburg", "Saint John", "Pointe-aux-Trembles", "Chateauguay", "New Glasgow", "Dauphin", "St Thomas",
			"Victoria", "Port Moody", "Greenfield Park", "Stephenville", "Lachine", "Pickering", "Blainville", "Verdun", "Valley", "Niagara Falls", "Charlottetown", "Reinfeld",
			"Grand-Mere", "Chilliwack", "Georgetown", "Grand-Sault/Grand Falls", "Longueuil", "Corner Brook", "Reserve Mines", "Comox", "Hebbville", "Portage la Prairie",
			"Oshawa", "Bedford", "Orillia", "Dawson Creek", "Thunder Bay", "Big Valley", "Enterprise", "Amos", "Mont-Royal", "Burnaby", "Drummondville", "Saint-Bruno",
			"Simcoe", "Coquitlam", "Derby Junction", "Guelph", "Rimouski", "Woodbridge", "Sherbrooke", "Vanier", "Cardigan", "Amherst", "Terrebonne", "Pointe-Claire",
			"Brantford", "Grande Prairie", "Dundas", "Sudbury", "Fort McMurray", "Welshpool", "Brossard", "Saint-Hubert", "Trail", "West Kelowna", "Moncton", "Sarnia",
			"Prince George", "Nelson", "Salt Spring Island", "Tillsonburg", "Truro", "Espanola", "Albanel", "Lyttleton", "Trochu", "Amqui", "Cap-aux-Meules", "Anjou", "Chatham",
			"Fatima", "Montmagny", "Cranbrook", "Victoriaville", "Lethbridge", "Kenora", "Camrose", "Baie-Sainte-Anne", "Brampton", "Deer Lake", "Saint-Stanislas", "Janeville",
			"Boucherville", "St. Albert", "Sainte-Sophie", "Saint-Eustache", "Wetaskiwin", "Saint-Jean-sur-Richelieu", "Membertou", "Sydney", "Nepean", "Kimberley",
			"English Settlement", "Saint-Basile", "St Martins", "La Malbaie", "Saint-Thomas", "Dawson Settlement", "Les Cedres", "Pembroke", "Beresford", "Port Coquitlam",
			"Leith", "Proston", "Hamel", "Talmalmo", "Lane Cove", "Cartmeticup", "Nyamup", "Bendick Murrell", "Purrawunda", "Blanchetown", "Rockside", "Rosegarland",
			"Ringwood", "Maylands", "Wooloowin", "Arthurville", "Mapleton", "Tuggerawong", "Red Hill", "Inverlaw", "Eugowra", "Kotara Fair", "Burpengary", "Ellis Beach",
			"Fish Creek", "Kennedy", "Cape Portland", "Warra", "Wanguri", "Alvie", "Wherrol Flat", "Placid Hills", "Nedlands", "Auchenflower", "Buninyong", "Dangar Island", "Sunny Nook", "Minden",
			"Tibradden", "Clermont", "Kadina", "Sawtell", "East Gosford", "Fosterville", "Bateau Bay", "Glenmoral", "Bolivia", "East Melbourne", "Taringa", "Koolan Island", "Maleny",
			"Yelverton", "Flinders", "Empire Bay", "Rose Bay North", "Macks Creek", "East Toowoomba", "Bimbijy", "Kundabung", "Pinnacle", "Watsonville", "Seaforth", "White Hills",
			"Bellangry", "Ascot", "Stafford Heights", "Bygalorie", "Boolaroo", "Brookhill", "Hillston", "Ivanhoe East", "Caniambo", "Myrniong", "Woolamai", "Wardering", "Kukerin", "Somers",
			"Wayatinah", "Alligator Creek", "Camp Mountain", "Brandy Creek", "Sovereign Hill", "Arno Bay", "Maffra", "Ulverstone", "Wattle Hill", "Bower", "Stonehaven",
			"East Newdegate", "Emerald", "Katunga", "Willunga", "Two Rocks", "Caldwell", "Coppabella", "Calala", "Nambucca Heads", "Mccullys Gap", "Toowoomba South", "Applecross",
			"Camberwell West", "North Perth", "Coombell", "Pacific Heights", "Guildford", "Herron", "Mirrool", "Bundaberg West", "Reservoir", "Upper Kedron", "Buchan", "Beltana",
			"Kingswood", "Nicholls Rivulet", "Upper Mount Gravatt", "Ridgley", "Tubbut", "Collingullie", "Munno Para", "Tyagarah", "Redgate", "Modewarre", "Stirling Range National Park",
			"Trowutta", "Rouse Hill", "Wyandra", "Goondi Hill", "Hill River", "Fairview Park", "Bar Beach", "University Of Tasmania", "Regent West", "Oxley", "Don", "Nyora", "Croydon",
			"Montrose", "Oak Park", "Nailsworth", "Tarong", "Kensington Park", "Ashmore", "Granya", "Alexandra", "Wirrulla", "Weymouth", "Summer Hill", "Shailer Park", "Bell", "Licola",
			"Walyormouring", "Boronia", "Baddaginnie", "Berrilee", "Barmaryee", "Longford", "Simson", "Killabakh", "Paluma", "Barnawartha", "Holwell", "Combienbar", "Port Adelaide",
			"Klemzig", "Emu Park", "Travancore", "Whetstone", "Corella", "Humpty Doo", "Goode Beach", "Heidelberg Rgh", "Waterloo", "Minyip", "Hunchy", "Grosvenor Place",
			"Pacific Paradise", "Hungerford", "Boya", "Elizabeth West", "Gumly Gumly", "Pagewood", "Tawonga", "Hamlyn Heights", "Southtown", "East Bowes", "Blue Haven",
			"Cramphorne", "Beelbi Creek", "Tanbar", "Battery Point", "Laura", "Kidman Park", "Woodville", "Pedler Creek", "Muckleford South", "Sydney South", "Bandy Creek",
			"Carwarp", "Eltham", "Doncaster East", "Welbungin", "Shenton Park", "Girraween", "Woronora", "Woodbury", "Lee Point", "Baranduda", "Police Point", "Williamstown",
			"Civic Square", "Taragoola", "Charleston", "Kealy", "Lillimur", "Officer", "Lilli Pilli", "Blue Rocks", "Westminster", "Karama", "Ocean Shores", "Eastwood",
			"Gloucester", "The Risk", "Yanco", "Port Fairy", "Queenton", "Watercarrin", "Yeppoon", "Bobalong", "Wurdiboluc", "North Dandalup", "Seddon", "Hindmarsh", "Julia Creek",
			"Salter Point", "Lilydale", "Tea Gardens", "Yallah", "Cavendish", "Condobolin", "West Tamworth", "Campsie", "Merrylands", "Townsville Milpo", "Runnymede", "Coominya",
			"Aroona", "Duramana", "Saltwater River", "Bluff", "Kingaroy", "Nangetty", "Uarbry", "Cudgera Creek", "East Nanango", "Oakleigh South", "Gununa", "Salamander Bay",
			"Bundaberg North", "Middleton", "Eaglemont", "Premer", "Trott Park", "Boynewood", "Maraylya", "Wayville", "Burnside", "Daradgee", "Weetulta", "Auburn", "South Hobart",
			"Forbes", "Forest Reefs", "Rocklands", "Oaklands Park", "Buckland Park", "Varsity Lakes", "Appin", "Adelaide River", "Harris Park", "Kallista", "Camena", "Woodberry",
			"Rocky Gully", "Preston Beach", "Brigalow", "Beermullah", "Ridgewood", "Bayles", "Moorabbin Airport", "Waratah West", "Cullulleraine", "Cairns City", "Warding East",
			"Cape Paterson", "Cabramatta", "Kongorong", "Digby", "Sedan", "Braybrook", "Inkpen", "Gillieston Heights", "Neerabup", "Mount Martha", "Appila", "Etty Bay", "Lower Hermitage",
			"Degilbo", "Eastern Heights", "Normanville", "Yorkrakine", "Kialla East", "Glen Boughton", "Ongerup", "Clunes", "Pierces Creek", "Andergrove", "Concord West", "Bethania",
			"Barooga", "Willetton", "Stratton", "Elimbah", "Changerup", "Durham Downs", "Bouvard", "Bentley Dc", "Thornton", "Eagle Farm", "Peake", "Chippendale", "Gorokan", "Grevillia",
			"Chatsworth", "Bawley Point", "Weengallon", "Tuggeranong Dc", "Shannon", "Greenhills", "Cherrybrook", "Junee", "Tungkillo", "Tarawera", "Scotts Head", "Pakenham Upper",
			"Westerway", "Burrier", "East Nabawa", "Millers Point", "Bunya Mountains", "Mayfield East", "Verges Creek", "Marshdale", "Bundall", "Mount Nasura", "Parndana", "Dripstone",
			"Gnotuk", "Yarralumla", "Muja", "Summerhill", "Port Flinders", "Wombeyan Caves", "Dartnall", "Dural", "Wandering", "Manjimup", "Grange", "Indented Head", "Marla", "Mungabunda",
			"Houston", "Larrakeyah", "Docklands", "Gabbadah", "Morundah", "Trungley Hall", "Greenslopes", "Grovedale", "Elanora", "North Fremantle", "Fyshwick", "Allworth", "Kingsway West",
			"Woodford", "Breakaway", "Gorrie", "Koorlong", "Wardell", "Bongeen", "Waverley", "Forrest", "Gundaroo", "North Boyanup", "Mouroubra", "Flinders University", "Crows Nest",
			"Panmure", "Oakhurst", "Mandurah East", "Daisy Hill", "Tarnagulla", "Steels Creek", "Broken Head", "Port Melbourne", "Happy Valley", "Benambra", "Brockman", "Amphitheatre",
			"Penrith", "Darke Peak", "Mole Creek", "Emerald Beach", "Logan Village", "Coober Pedy", "Berowra Heights", "Innaloo", "Leeman", "East Damboring", "Kinglake West",
			"Canning Vale", "Upper Glastonbury", "Caroline Springs", "Hamlyn Terrace", "Darbys Falls", "Carlsruhe", "Paulls Valley", "Mirani", "Buckland", "Mitta Mitta", "Boat Harbour Beach",
			"Botany", "Scaddan", "Lenswood", "Farrell Flat", "Melrose", "Freemans Waterhole", "Simpsons Bay", "Ripponlea", "North Cascade", "Ensay", "Golden Point", "Middle Cove",
			"Waterfront Place", "Buraminya", "Balnagowan", "Lower Cressbrook", "Oak Flats", "Orange Hill", "Minnenooka", "Wagga Wagga South", "Wansbrough", "Pintharuka", "Eumundi",
			"Halton", "Glenmore Park", "Mccutcheon", "Pimpimbudgee", "Ilford", "Caparra", "Duaringa", "Weston", "Oakey", "Barton", "Lanena", "Cora Lynn", "Allora", "Willow Tree",
			"Keilor Downs", "Barringun", "Pilliga", "Rhodes", "Castletown", "San Mateo","Plainfield", "Eugene", "Hilo", "Turill"};

	private CityValues() {/* Disables instantiation */}

	public static int getLength() {
		return values.length;
	}

	public static String getValue(int index) {
		return values[index];
	}

	public static String getRandomValue() {
		return values[ThreadLocalRandom.current().nextInt(0, values.length)];
	}

	public static String getUniqueKVPairsString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\"");
		Map<String, String> uniqueKVPairs = new HashMap<>();
		for(String value : values) {
			if(!uniqueKVPairs.containsKey(value)) {
				uniqueKVPairs.put(value, value);
				sb.append(value).append("\", \"");
			}
		}
		return sb.append("\"}").toString();
	}

}
