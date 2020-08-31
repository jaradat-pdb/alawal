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
public class AddressValues {

	private static final String[] values = {"6649 N Blue Gum St", "4 B Blue Ridge Blvd", "8 W Cerritos Ave No54", "639 Main St", "34 Center St", "3 Mcauley Dr", "7 Eads St",
			"7 W Jackson Blvd", "5 Boston Ave No88", "228 Runamuck Pl No2808", "2371 Jerrold Ave", "37275 St  Rt 17m M", "25 E 75th St No69", "98 Connecticut Ave Nw",
			"56 E Morehead St", "73 State Road 434 E", "69734 E Carrillo St", "322 New Horizon Blvd", "1 State Route 27", "394 Manchester Blvd", "6 S 33rd St",
			"6 Greenleaf Ave", "618 W Yakima Ave", "74 S Westgate St", "3273 State St", "1 Central Ave", "86 Nw 66th St No8673", "2 Cedar Ave No84",
			"90991 Thorburn Ave", "386 9th Ave N", "74874 Atlantic Ave", "366 South Dr", "45 E Liberty St", "4 Ralph Ct", "2742 Distribution Way",
			"426 Wolf St", "128 Bransten Rd", "17 Morena Blvd", "775 W 17th St", "6980 Dorsett Rd", "2881 Lewis Rd", "7219 Woodfield Rd",
			"1048 Main St", "678 3rd Ave", "20 S Babcock St", "2 Lighthouse Ave", "38938 Park Blvd", "5 Tomahawk Dr", "762 S Main St",
			"209 Decker Dr", "4486 W O St No1", "39 S 7th St", "98839 Hawthorne Blvd No6101", "71 San Mateo Ave", "76 Brooks St No9", "4545 Courthouse Rd",
			"14288 Foster Ave No4121", "4 Otis St", "65895 S 16th St", "14302 Pennsylvania Ave", "201 Hawk Ct", "53075 Sw 152nd Ter No615", "59 N Groesbeck Hwy",
			"2664 Lewis Rd", "59 Shady Ln No53", "3305 Nabell Ave No679", "18 Fountain St", "7 W 32nd St", "2853 S Central Expy", "74 W College St",
			"701 S Harrison Rd", "1088 Pinehurst St", "30 W 80th St No1995", "20932 Hedley St", "2737 Pistorio Rd No9230", "74989 Brandon St", "6 Kains Ave",
			"47565 W Grand Ave", "4284 Dorigo Ln", "6794 Lake Dr E", "31 Douglas Blvd No950", "44 W 4th St", "11279 Loytan St", "69 Marquette Ave",
			"70 W Main St", "461 Prospect Pl No316", "47154 Whipple Ave Nw", "37 Alabama Ave", "3777 E Richmond St No900", "3 Fort Worth Ave", "4800 Black Horse Pike",
			"83649 W Belmont Ave", "840 15th Ave", "1747 Calle Amanecer No2", "99385 Charity St No840", "68556 Central Hwy", "55 Riverside Ave", "7140 University Ave",
			"64 5th Ave No1153", "3 Secor Rd", "4 Webbs Chapel Rd", "524 Louisiana Ave Nw", "185 Blackstone Bldge", "170 Wyoming Ave", "4 10th St W",
			"7 W Pinhook Rd", "1 Commerce Way", "64 Lakeview Ave", "3 Aspen St", "32860 Sierra Rd", "555 Main St", "2 Se 3rd Ave",
			"2239 Shawnee Mission Pky", "2726 Charcot Ave", "5161 Dorsett Rd", "55892 Jacksonville Rd", "5 N Cleveland Massillon Rd", "7 Benton Dr", "9390 S Howell Ave",
			"8 County Center Dr No647", "4646 Kaahumanu St", "2 Monroe St", "52777 Leaders Heights Rd", "72868 Blackington Ave", "9 Norristown Rd", "83 County Road 437 No8581",
			"1 N Harlem Ave No9", "90131 J St", "8597 W National Ave", "6 Gilson St", "65 W Maple Ave", "866 34th Ave", "798 Lund Farm Way",
			"9387 Charcot Ave", "30553 Washington Rd", "481 W Lemon St", "4 Warehouse Point Rd No7", "4940 Pulaski Park Dr", "627 Walford Ave", "137 Pioneer Way",
			"61 13 Stoneridge No835", "2409 Alabama Rd", "8927 Vandever Ave", "134 Lewis Rd", "9 N College Ave No3", "60480 Old Us Highway 51", "4 Bloomfield Ave",
			"429 Tiger Ln", "54169 N Main St", "92 Main St", "72 Mannix Dr", "12270 Caton Center Dr", "749 W 18th St No45", "8 Industry Ln",
			"1 Huntwood Ave", "55262 N French Rd", "422 E 21st St", "501 N 19th Ave", "455 N Main Ave", "1844 Southern Blvd", "2023 Greg St",
			"63381 Jenks Ave", "6651 Municipal Rd", "81 Norris Ave No525", "6916 W Main St", "9635 S Main St", "17 Us Highway 111", "992 Civic Center Dr",
			"303 N Radcliffe St", "73 Saint Ann St No86", "44 58th St", "9745 W Main St", "84 Bloomfield Ave", "287 Youngstown Warren Rd", "6 Van Buren St",
			"229 N Forty Driv", "2887 Knowlton St No5435", "523 Marquette Ave", "3717 Hamann Industrial Pky", "3 State Route 35 S", "82 N Highway 67", "9 Murfreesboro Rd",
			"6 S Broadway St", "6 Harry L Dr No6327", "47939 Porter Ave", "9 Wales Rd Ne No914", "195 13n N", "99 Tank Farm Rd", "4671 Alemany Blvd",
			"98 University Dr", "50 E Wacker Dr", "70 Euclid Ave No722", "326 E Main St No6496", "406 Main St", "3 Elmwood Dr", "9 Church St",
			"9939 N 14th St", "5384 Southwyck Blvd", "97 Airport Loop Dr", "37855 Nolan Rd", "4252 N Washington Ave No9", "42754 S Ash Ave", "703 Beville Rd",
			"5 Harrison Rd", "73 Southern Blvd", "189 Village Park Rd", "6 Middlegate Rd No106", "1128 Delaware St", "577 Parade St", "70 Mechanic St",
			"4379 Highway 116", "55 Hawthorne Blvd", "7116 Western Ave", "2026 N Plankinton Ave No3", "99586 Main St", "8739 Hudson St", "383 Gunderman Rd No197",
			"4441 Point Term Mkt", "2972 Lafayette Ave", "2140 Diamond Blvd", "93 Redmond Rd No492", "3989 Portage Tr", "1 Midway Rd", "77132 Coon Rapids Blvd Nw",
			"755 Harbor Way", "87 Sierra Rd", "7667 S Hulen St No42", "75684 S Withlapopka Dr No32", "5 Elmwood Park Blvd", "23 Palo Alto Sq", "38062 E Main St",
			"3958 S Dupont Hwy No7", "560 Civic Center Dr", "3270 Dequindre Rd", "1 Garfield Ave No7", "9122 Carpenter Ave", "48 Lenox St", "5 Little River Tpke",
			"3 N Groesbeck Hwy", "37 N Elm St No916", "433 Westminster Blvd No590", "66697 Park Pl No3224", "96263 Greenwood Pl", "8 Mcarthur Ln", "8 Fair Lawn Ave",
			"9 N 14th St", "9 Vanowen St", "18 Waterloo Geneva Rd", "506 S Hacienda Dr", "3732 Sherman Ave", "25657 Live Oak St", "4923 Carey Ave",
			"3196 S Rider Trl", "3 Railway Ave No75", "87393 E Highland Rd", "67 E Chestnut Hill Rd", "33 Lewis Rd No46", "8100 Jacksonville Rd No7", "7 W Wabansia Ave No227",
			"25 Minters Chapel Rd No9", "6882 Torresdale Ave", "985 E 6th Ave", "7 West Ave No1", "26659 N 13th St", "669 Packerland Dr No1438", "759 Eldora St",
			"5 S Colorado Blvd No449", "944 Gaither Dr", "66552 Malone Rd", "77 Massillon Rd No822", "25346 New Rd", "60 Fillmore Ave", "57 Haven Ave No90",
			"6538 E Pomona St No60", "6535 Joyce St", "78112 Morris Ave", "96950 Hidden Ln", "3718 S Main St", "9677 Commerce Dr", "5 Green Pond Rd No4",
			"636 Commerce Dr No42", "42744 Hamann Industrial Pky No82", "1950 5th Ave", "61304 N French Rd", "87 Imperial Ct No79", "94 W Dodge Rd", "4 58th St No3519",
			"5221 Bear Valley Rd", "9648 S Main", "7 S San Marcos Rd", "812 S Haven St", "3882 W Congress St No799", "4 E Colonial Dr", "45 2nd Ave No9759",
			"57254 Brickell Ave No372", "8977 Connecticut Ave Nw No3", "9 Waydell St", "43 Huey P Long Ave", "7563 Cornwall Rd No4462", "22 Bridle Ln", "70099 E North Ave",
			"3211 E Northeast Loop", "26 Montgomery St", "13252 Lighthouse Ave", "206 Main St No2804", "96541 W Central Blvd", "34 Saint George Ave No2", "47857 Coney Island Ave",
			"8573 Lincoln Blvd", "596 Santa Maria Ave No7913", "3829 Ventura Blvd", "13 S Hacienda Dr", "40 9th Ave Sw No91", "2845 Boulder Crescent St", "33 State St",
			"2 S 15th St", "4 Kohler Memorial Dr", "1 Rancho Del Mar Shopping C", "3943 N Highland Ave", "5 Williams St", "60 Old Dover Rd", "8 Sheridan Rd",
			"85092 Southern Blvd", "64 Newman Springs Rd E", "48 Stratford Ave", "80 Pittsford Victor Rd No9", "87163 N Main Ave", "393 Lafayette Ave", "99 5th Ave No33",
			"49 N Mays St", "993 Washington Ave", "88 15th Ave Ne", "3381 E 40th Ave", "201 Ridgewood Rd", "39 Moccasin Dr", "4 Carroll St",
			"9581 E Arapahoe Rd", "33 N Michigan Ave", "2 S Biscayne Blvd", "8 Us Highway 22", "7422 Martin Ave No8", "94 Chase Rd", "8139 I Hwy 10 No92",
			"5 Cabot Rd", "3387 Ryan Dr", "3125 Packer Ave No9851", "347 Chestnut St", "8116 Mount Vernon Ave", "8772 Old County Rd No5410", "868 State St No38",
			"772 W River Dr", "73 W Barstow Ave", "61047 Mayfield Ave", "2139 Santa Rosa Ave", "598 43rd St", "70295 Pioneer Ct", "92899 Kalakaua Ave",
			"395 S 6th St No2", "9506 Edgemore Ave", "72119 S Walker Ave No63", "369 Latham St No500", "3158 Runamuck Pl", "9 Plainsboro Rd No598", "8728 S Broad St",
			"2215 Prosperity Dr", "1 S Pine St", "187 Market St", "94290 S Buchanan St", "7061 N 2nd St", "10759 Main St", "97 E 3rd St No9",
			"82 Winsor St No54", "41 Steel Ct", "49440 Dearborn St", "7 S Beverly Dr", "919 Wall Blvd", "89 20th St E No779", "721 Interstate 45 S",
			"3 Lawton St", "38 Pleasant Hill Rd", "45 E Acacia Ct", "63728 Poway Rd No1", "77 222 Dr", "53 W Carey St", "617 Nw 36th Ave",
			"539 Coldwater Canyon Ave", "735 Crawford Dr", "910 Rahway Ave", "7 Tarrytown Rd", "35433 Blake St No588", "29 Cherry St No7073", "810 N La Brea Ave",
			"987 Main St", "36 Enterprise St Se", "8429 Miller Rd", "5 W 7th St", "2 Flynn Rd", "2094 Ne 36th Ave", "649 Tulane Ave",
			"2094 Montour Blvd", "393 Hammond Dr", "8590 Lake Lizzie Dr", "87895 Concord Rd", "46314 Route 130", "4 Cowesett Ave", "95 Main Ave No2",
			"28 S 7th St No2824", "79 S Howell Ave", "36 Lancaster Dr Se", "2759 Livingston Ave", "17 Jersey Ave", "2 W Grand Ave", "18 Coronado Ave No563",
			"72 Beechwood Ter", "92 Broadway", "39 Franklin Ave", "4 Iwaena St", "32820 Corkwood Rd", "34 Raritan Center Pky", "6201 S Nevada Ave",
			"78 Maryland Dr No146", "76598 Rd  I 95 No1", "1610 14th St Nw", "86350 Roszel Rd", "1644 Clove Rd", "9 W Central Ave", "27846 Lafayette Ave",
			"10276 Brooks St", "1 Century Park E", "9 State Highway 57 No22", "4 S Washington Ave", "25 Se 176th Pl", "105 Richmond Valley Rd", "22 Spruce St No595",
			"2 W Beverly Blvd", "72 Southern Blvd", "1 Washington St", "90177 N 55th Ave", "9 Tower Ave", "278 Bayview Ave", "80312 W 32nd St",
			"82 Us Highway 46", "4 Stovall St No72", "19 Amboy Ave", "63 Smith Ln No8343", "11360 S Halsted St", "26849 Jefferson Hwy", "2500 Pringle Rd Se No508",
			"65 Mountain View Dr", "1 N San Saba", "51120 State Route 18", "1482 College Ave", "4119 Metropolitan Dr", "2167 Sierra Rd", "6 Sunrise Ave",
			"55713 Lake City Hwy", "75698 N Fiesta Blvd", "88 Sw 28th Ter", "7 Flowers Rd No403", "4 Nw 12th St No3849", "2 A Kelley Dr", "88827 Frankford Ave",
			"2 W Scyene Rd No3", "62260 Park Stre", "3424 29th St Se", "35 E Main St No43", "7163 W Clark Rd", "21575 S Apple Creek Rd", "747 Leonis Blvd",
			"13 Gunnison St", "18 3rd Ave", "62 W Austin St", "177 S Rider Trl No52", "2 W Mount Royal Ave", "1953 Telegraph Rd", "63517 Dupont St",
			"5 E Truman Rd", "251 Park Ave No979", "43496 Commercial Dr No29", "2184 Worth St", "50126 N Plankinton Ave", "38773 Gravois Ave", "16452 Greenwich St",
			"40 Cambridge Ave", "20113 4th Ave E", "6 Ridgewood Center Dr", "469 Outwater Ln", "62 Monroe St", "3338 A Lockport Pl No6", "9 Hwy",
			"8284 Hart St", "5 Washington St No1", "8 S Haven St", "9 Front St", "1933 Packer Ave No2", "67 Rv Cent", "2 Sw Nyberg Rd",
			"89992 E 15th St", "61556 W 20th Ave", "63 E Aurora Dr", "14 Taylor St", "5 Binney St", "8 Moor Place", "505 Exeter Rd",
			"5396 Forth Street", "9472 Lind St", "7457 Cowl St No70", "20 Gloucester Pl No96", "929 Augustine St", "45 Bradfield St No166", "620 Northampton St",
			"5 Hygeia St", "2150 Morley St", "24 Bolton St", "4 Forrest St", "89 Noon St", "99 Guthrie St", "7 Richmond St",
			"9165 Primrose St", "9 Pengwern St", "4410 Tarlton St", "6949 Bourne St", "148 Rembrandt St", "2200 Nelson St No58", "61 Rossett St",
			"41 Canning St", "8289 Cadogan St", "211 Hobart St", "114 Falkland St No8845", "1 Birkett St", "5147 Blackstone St", "7 Shenstone St",
			"129 Alexander Pope St", "2 Birchfield Rd", "7523 Kempton Rd", "6305 Elstow St", "218 Greenbank Drive", "8921 Forge St", "3060 St Ambrose Grove No261",
			"8388 Bessemer St No5", "87 Pownall Sq", "39 Wye St", "2732 Bostock St No1", "5562 Fairfield St No847", "37 Meadow St", "3 Nevison St",
			"5662 William Moult St", "3 North View No35", "135 Opie St", "1 Askew St", "4 Burnall St", "95 Denton St", "5 Chadwick St No7",
			"67 Micawber St", "43 Williamson St No7995", "5 Howe St", "7 Cheapside No9", "85 Bridgewater St", "763 Parkfield Rd", "662 Grove Park",
			"5410 Lawton St", "3 August Rd", "476 Starkie St", "6448 Tillard St", "3055 Creswick St", "7 Jolliffe St", "1175 Greig St",
			"636 Portland Place", "41 Benedict St", "62 Margaret St", "5152 Sophia St", "1 Back Canning St", "9 Gradwell St", "9205 Upper Hill St",
			"9 Horatio St", "61 Miriam St", "67 Pulford St", "821 Pembroke Place", "3 Alder St", "80 Morecambe St", "7866 Renshaw St No283",
			"658 Lake St", "5382 Redfern St", "45 Bidder St No38", "6766 Britton St No379", "7 Lear Rd", "2577 Toxteth St No5", "761 Cockerell St No1",
			"9 Cypress St", "6 Romilly St", "51 St Anne St No12", "823 Idris St", "8764 Nickleby St No877", "5344 Bengel St No5", "8880 Great Howard St No7750",
			"9 Oakleigh", "83 Denbigh St Bootle", "30 Aughton St", "260 Saxon St", "3 Pyramid St", "37 Langham St No948", "94 Villars St",
			"73 Hawkstone St", "123 Sussex St", "484 Barry St", "7033 Micawber St", "33 Vipond St", "85 Hero St", "77 Reading St No8",
			"274 Altcar Ave", "38 Avondale Rd No79", "4679 Curzon St", "13 Nelson Rd", "2546 Hunter St", "77 Mason St No650", "94 Wakefield St",
			"529 Stalmine Rd No3680", "52 Morningside Rd No1", "94 Enid St", "661 Great Crosshall St", "227 Albert Terrace", "464 Back Nile St No618", "42 Eastwood St",
			"2877 Grain St", "13 Stockdale St No779", "9 Cropper St", "3 Gaskell St", "5221 Royston St", "83 St Johns Lane No43", "603 Pall Mall",
			"76 Dawber St No6", "3380 Alexander St", "216 Lissant St No8", "92 Phythian St No614", "792 Queens Rd", "5196 York St", "428 Kearsley St",
			"8 Chestnut St", "998 Roe St No6", "3 Copenhagen Rd", "293 Vivian St", "8 Barlow St No6", "5 Shakspeare St No66", "7 Carolina St",
			"52 Trowbridge St", "25 Village St", "4 Peach St No5112", "3614 Old Hall St No604", "3768 Hey Green Rd", "97 Newlands St", "6226 Maitland St",
			"891 Crocus St", "1 Segrave St", "666 Moor Place", "1554 Christopher St", "55 Margaret Rd", "8830 Antonio St", "82 Sinclair St",
			"7568 Atlas St", "93 Clyde Rd No9", "18 Nimrod St", "6 Cannock St", "2258 Benedict St", "9302 Ismay St No6", "3347 Lawrence Rd No456",
			"47 Elwy St", "553 Picton Rd", "9986 Cantsfield St", "1 Sussex St", "9548 Ogwen St No84", "57 St Georges Hill", "385 Upper Hampton St No39",
			"6378 Lyell St No48", "675 Falstaff St No170", "87 Pelops St", "5 Eyes St", "2427 Olney St No7", "805 Westbank Rd", "36 Cranmer St No4697",
			"2 Kirkdale Rd", "4687 Atherton St", "513 Bailey St", "620 Old Leeds St", "5149 Maria Rd", "8 Taylor St", "588 Venmore St",
			"1 Newby St", "5588 Lake St No903", "9112 Hardwick St", "2395 Gloucester Pl", "341 Birchfield St", "9854 Ranelagh Place", "8 Nova Scotia",
			"72 Lime Place", "907 Denman St", "5 Garfield St No9", "345 Feltwell Rd", "1 Towson St", "4 Candia St No6", "2 Cherry Lane",
			"7 Britannia Ave No875", "63 Brunswick Sq", "5 Gainsborough Rd", "745 Goodall St No9309", "1267 Alderson Rd", "2 Gay St No3702", "3409 Benns Gardens",
			"1 Lower Burlington St", "4706 Chapel Place No5993", "4 Mather St", "9960 Gilroy Rd", "3 Burnall St", "8 Bigham Rd", "950 Gordon St",
			"784 Juno St No7653", "69 Chantrey St No90", "4 Northbrook St No600", "526 Liffey St No759", "6301 Dorset Rd", "4 Summer Seat Bootle", "84 Walton Village",
			"8 Tagus St No9814", "770 Jamaica St", "11 Tetlow St", "7642 Ledward St", "1432 Rutland Ave", "22 Harewood St No95", "645 Lister Drive",
			"8977 Old Leeds St No87", "22 Delamore St", "35 Walton Lane", "22 Kilshaw St", "1 Argyle St", "3 Garden Lane", "4309 Chisenhale St",
			"758 Woodhouse St", "18 Ouse St", "5 Ruskin St", "4565 Blackstock St", "8361 Cottenham St", "1267 Audley St", "845 Atherton St",
			"150 Margaret Rd", "9923 Dinorben St No4838", "186 Craven St No68", "5160 High St No38", "3833 Sidney Rd", "6267 Greenland St", "14 Landseer Rd",
			"30 Seville St", "79 Chelmsford St", "8 South John St", "50 Townsend St", "7643 Campbell St", "371 Oakleigh", "9874 Oakfield Rd",
			"6 Princes St", "4190 Seacombe St", "3145 Rhyl St", "4919 Lime Grove", "8 Carolina St", "1592 Price St", "2 Weller St",
			"18 Thomas St", "42 Hey Green Rd", "256 Vesuvius St No159", "82 Denison St No2642", "1779 Bird St", "99 College St South No1", "29 Greenleaf St",
			"39 Hooton Place", "198 Ranelagh Place", "353 Standish St No8264", "87 Eldon Place", "592 Catharine St", "1661 Arrow St", "7 Netley St",
			"7 St Edmonds Rd", "6996 Wrenbury St", "2 Prince Rupert St", "9970 Clyde Rd", "9 Fielding St", "555 Ludlow St", "1 James St No4",
			"3 Byng St No524", "425 Howley St", "4041 Virgil St", "32 High Park St No44", "88 Vernon St", "62 Euston St", "74 Medlock St",
			"80 Talbot St", "31 Buckingham Ave No3785", "162 Grayson St", "5 Webb St No8", "8092 Firdale Rd", "68 Carno St", "714 Moored St",
			"545 North John St", "21 Pilgrim St", "9772 Teilo St", "33 Fonthill Rd", "3 Ivyleigh", "501 Sandon Terrace No200", "9 Duckenfield St",
			"5466 Sedley St", "75 Brewster St No453", "7901 Beech St", "684 Cotswold St", "5 April Rd No13", "8 Village St", "7 Haddock St No34",
			"9 Mather St", "70 Rose Vale", "29 Oregon St", "15 East Albert Rd", "3186 Naylor St", "9 Herbert St No77", "9830 Croxteth Rd",
			"1054 Gladys St", "921 Douro St No1520", "180 Frodsham St", "7217 Edge Grove", "12 Gelling St", "763 Roscoe St", "419 St Andrew St",
			"623 Cornhill", "328 Havelock St No61", "1056 College St South", "11 Denison St No7", "30 Daulby St", "201 Bran St", "1346 Vandyke St",
			"883 Howe St", "231 Wordsworth St", "2449 Amberly St No6364", "8430 Shadwell St", "115 Lister Rd", "7855 Sir Thomas St No7499", "1 Milton St",
			"1111 Nesfield St", "1831 Richards St No8", "8054 Low Hill", "7252 Dansie St", "76 Paulton St", "4 Cochrane St", "5679 Gloucester Pl",
			"45 Ledward St", "4 Monmouth Rd", "64 Croyland St", "4 Vivian St", "35 Dublin St", "87 Pickup St", "7 Cottenham St",
			"622 Holmes St", "40 Peters Lane", "2 Cockburn St", "65 Oban Rd", "31 Davy St", "80 Ellerslie Rd", "4 Sherwood St",
			"8362 Whithorn St", "25 Dale St No2", "68 Scotland Place", "338 Alfonso Rd", "65 Rankin St", "8 Cookson St", "7 Lockhart St",
			"363 Vandries St", "8 Gertrude St", "826 Rumney Rd West No7", "954 Madelaine St", "7602 Brook St No86", "966 Bower St", "2 Seacombe St",
			"83 Battenburg St", "2 Whitefield Rd", "869 Luke St", "4 Ogwen St", "205 Forge St No4021", "999 Upper Harrington St No61", "3 Greenleaf St No5644",
			"493 Wellington Rd", "1257 Stone St", "1 Bousfield St", "59 Westminster Rd", "143 Clark St No802", "421 Monument Place No44", "8 Gullett St",
			"2767 Pembroke St No979", "47 Orry St No8243", "5 Noon St", "510 Belvidere Rd", "860 Rokeby St", "9362 Solomon St No97", "916 Strand St No4753",
			"5 Bentinck St", "954 Birchdale Rd", "7 Great Orford St", "488 Mulberry St", "1761 Johnstone St", "8899 Mere Lane", "6 St Hilda St",
			"2725 Underley St No6452", "6061 Back Nile St", "9735 Linton St No2284", "9 Herbert St", "40 Cairo St", "7199 St Clare Rd", "6 Conyers St No3346",
			"8657 Cedar St No2", "8 Jacob St", "6174 Botanic Pl", "9730 Dunnet St", "8783 High St", "8 Breckfield Road North", "82 Waterhouse Lane",
			"2 Park Rd Walton No4338", "59 Charles St", "593 Kinglake St", "404 Aigburth St No4246", "690 Copenhagen Rd", "7 Canton St", "79 Pine St",
			"9 Lodwick St", "9 Ogwen St", "1730 Seymour St", "35 Elton St No3", "8 Hinton St No8241", "751 Stamford St", "70 Royal St",
			"5 Minerva St", "1 Northampton St", "2 Maple Grove", "794 Hook St", "91 Ludlow St", "51 Freehold St No224", "7 Hey Green Rd No4",
			"2476 Marsh St", "597 Threlfall St No72", "1 Jervis St", "7602 Grantham St", "10 Carisbrooke St", "78 Pine Grove", "7 Varthen St",
			"8 Thomaston St", "527 Harding St", "1616 Menzies St No453", "3922 Leda St", "6352 Grosvenor St", "4313 Princes Park Terrace", "9 Sydney Place",
			"2015 Suburban Rd", "769 Euston St", "46 Stevenson St", "1400 Ash St", "8822 Trafalgar St", "28 Berwick St", "94 Regent St",
			"30 Marine Parade No1", "8 Pim Hill St", "8451 Bengel St", "159 Carlton St", "38 Raffles St", "650 Goring St", "6 Chestnut St",
			"4 Peover St", "328 Pallas St", "9 Waltham Rd", "352 Strathmore Rd", "529 Llanrwst St", "1980 Tynemouth St", "8598 Rumney Rd",
			"9283 Ruth St No81", "5544 Sutherland St", "9 Jackson St", "3612 Bixteth St", "4545 Victoria Rd", "5 Hampden St", "6452 Pilgrim St No5",
			"1149 Highfield Rd No996", "21 Pickwick St", "19 Soho St", "236 Blantyre Rd", "70 Lilly Rd", "58 Gloucester Rd", "88 Upper Harrington St",
			"4920 Fazakerley Rd", "6 Morley St", "7316 Friar St", "8 Heathfield St No657", "275 Peel Sq", "726 Westmoreland Place", "7 Water St",
			"4 Covent Garden", "9166 Devon St No905", "70 Foster St", "714 Fonthill Rd", "9 Milton St", "6 Norwood Grove"};

	private AddressValues() {/* Disables instantiation */}

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
		sb.append("    private static final String[] values = {");
		int counter = 0;
		Map<String, String> uniqueKVPairs = new HashMap<>();
		for(String value : values) {
			if(!uniqueKVPairs.containsKey(value)) {
				uniqueKVPairs.put(value, value);
				counter++;
				sb.append("\"").append(value);
				if(counter == 7) {
					sb.append("\"\n            ");
					counter = 0;
				}
				else {
					sb.append("\", ");
				}
			}
		}
		
		String uniqueKVPairsStr = sb.toString();
		if(uniqueKVPairsStr.endsWith(", ")) {
			int index = uniqueKVPairsStr.lastIndexOf(", ");
			uniqueKVPairsStr = uniqueKVPairsStr.subSequence(0, index).toString();
			uniqueKVPairsStr = uniqueKVPairsStr.concat("};");
		}
		
		return uniqueKVPairsStr;
	}

}
