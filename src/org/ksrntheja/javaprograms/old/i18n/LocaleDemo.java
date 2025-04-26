/*
 * (16) Internationalization
 * (16 - 1) Locale
 */

package org.ksrntheja.javaprograms.old.i18n;

import java.util.Locale;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class LocaleDemo {

    public static void main(String[] args) {

        separator("Default Locale");
        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale.getCountry() + " " + defaultLocale.getLanguage());
        System.out.println(defaultLocale.getDisplayCountry() + " " + defaultLocale.getDisplayLanguage());

        separator("PA Locale");
        Locale localePa = new Locale("pa", "IN");
        Locale.setDefault(localePa);
        System.out.println(Locale.getDefault().getDisplayLanguage());
        System.out.println("Setting back");
        Locale.setDefault(defaultLocale);


        separator("ISO Languages");
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage);
        }

        separator("ISO Countries");
        String[] isoCountries = Locale.getISOCountries();
        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry);
        }

        separator("Available Locales");
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.println(locale.getDisplayCountry() + " " + locale.getDisplayLanguage());
        }

    }

}

/*
====================================================================================
Default Locale
====================================================================================
IN en
India English
====================================================================================
PA Locale
====================================================================================
ਪੰਜਾਬੀ
Setting back
====================================================================================
ISO Languages
====================================================================================
aa
ab
ae
af
ak
am
an
ar
as
av
ay
az
ba
be
bg
bh
bi
bm
bn
bo
br
bs
ca
ce
ch
co
cr
cs
cu
cv
cy
da
de
dv
dz
ee
el
en
eo
es
et
eu
fa
ff
fi
fj
fo
fr
fy
ga
gd
gl
gn
gu
gv
ha
he
hi
ho
hr
ht
hu
hy
hz
ia
id
ie
ig
ii
ik
in
io
is
it
iu
iw
ja
ji
jv
ka
kg
ki
kj
kk
kl
km
kn
ko
kr
ks
ku
kv
kw
ky
la
lb
lg
li
ln
lo
lt
lu
lv
mg
mh
mi
mk
ml
mn
mo
mr
ms
mt
my
na
nb
nd
ne
ng
nl
nn
no
nr
nv
ny
oc
oj
om
or
os
pa
pi
pl
ps
pt
qu
rm
rn
ro
ru
rw
sa
sc
sd
se
sg
si
sk
sl
sm
sn
so
sq
sr
ss
st
su
sv
sw
ta
te
tg
th
ti
tk
tl
tn
to
tr
ts
tt
tw
ty
ug
uk
ur
uz
ve
vi
vo
wa
wo
xh
yi
yo
za
zh
zu
====================================================================================
ISO Countries
====================================================================================
AD
AE
AF
AG
AI
AL
AM
AO
AQ
AR
AS
AT
AU
AW
AX
AZ
BA
BB
BD
BE
BF
BG
BH
BI
BJ
BL
BM
BN
BO
BQ
BR
BS
BT
BV
BW
BY
BZ
CA
CC
CD
CF
CG
CH
CI
CK
CL
CM
CN
CO
CR
CU
CV
CW
CX
CY
CZ
DE
DJ
DK
DM
DO
DZ
EC
EE
EG
EH
ER
ES
ET
FI
FJ
FK
FM
FO
FR
GA
GB
GD
GE
GF
GG
GH
GI
GL
GM
GN
GP
GQ
GR
GS
GT
GU
GW
GY
HK
HM
HN
HR
HT
HU
ID
IE
IL
IM
IN
IO
IQ
IR
IS
IT
JE
JM
JO
JP
KE
KG
KH
KI
KM
KN
KP
KR
KW
KY
KZ
LA
LB
LC
LI
LK
LR
LS
LT
LU
LV
LY
MA
MC
MD
ME
MF
MG
MH
MK
ML
MM
MN
MO
MP
MQ
MR
MS
MT
MU
MV
MW
MX
MY
MZ
NA
NC
NE
NF
NG
NI
NL
NO
NP
NR
NU
NZ
OM
PA
PE
PF
PG
PH
PK
PL
PM
PN
PR
PS
PT
PW
PY
QA
RE
RO
RS
RU
RW
SA
SB
SC
SD
SE
SG
SH
SI
SJ
SK
SL
SM
SN
SO
SR
SS
ST
SV
SX
SY
SZ
TC
TD
TF
TG
TH
TJ
TK
TL
TM
TN
TO
TR
TT
TV
TW
TZ
UA
UG
UM
US
UY
UZ
VA
VC
VE
VG
VI
VN
VU
WF
WS
YE
YT
ZA
ZM
ZW
====================================================================================
Available Locales
====================================================================================

 Colognian
Montenegro Serbian
Syria French
Chad French
Togo French
Sweden Northern Sami
Tonga Tongan
 Chakma
Brazil Kaingang
Senegal French
Mauritania Fula
Bahrain Arabic
 Rajasthani
 Teso
Ukraine Ukrainian
China Chinese
Rwanda French
Nepal Nepali
Nigeria Yoruba
Nigeria Fula
Niger Fula
Latin America Spanish
Kenya Kamba
Seychelles French
United Arab Emirates Arabic
Italy Friulian
Ukraine Russian
Russia Russian
Uzbekistan Uzbek
 Kangri
Germany Lower Sorbian
Niger Hausa
Brunei Malay
 Cebuano
Nigeria Hausa
 Hindi
 Uzbek
Morocco Tachelhit
 Soga
Spain Catalan
Niger Tasawaq
 Kuvi
Djibouti Arabic
Morocco Tachelhit
 Mazanderani
Finland Inari Sami
 Santali
Tunisia French
Liberia Fula
Bosnia & Herzegovina Bosnian
Ethiopia Oromo
Myanmar (Burma) Burmese
Europe English
 Chiga
Italy Italian
world Esperanto
 Azerbaijani
Hong Kong SAR China Chinese
Mali Bambara
Japan Japanese
Ethiopia Amharic
 Vai
Congo - Kinshasa Lingala
France Breton
Poland Polish
Morocco Standard Moroccan Tamazight
Rwanda Kinyarwanda
 Makhuwa
Moldova Romanian
Niger Zarma
Faroe Islands Faroese
Latvia Latvian
Finland Skolt Sami
 Kuvi
South Sudan Nuer
Algeria Arabic
Wallis & Futuna French
 Cherokee
 Belarusian
India Kangri
Eritrea Arabic
India Urdu
Western Sahara Arabic
India Konkani
Vanuatu French
 Tachelhit
Egypt Arabic
India Kashmiri
Tanzania Sangu
Armenia Armenian
Kenya Masai
Serbia Serbian
Mayotte French
Uganda Nyankole
 Nigerian Pidgin
Russia Chechen
Bosnia & Herzegovina Serbian
 Central Kurdish
India Konkani
China Korean
Mozambique Makhuwa
Angola Lingala
Angola Portuguese
India Santali
 Swiss German
 Aghem
Romania Romanian
India Sanskrit
Italy Venetian
Jordan Arabic
 Nama
 Punjabi
Lithuania Lithuanian
Netherlands Western Frisian
Poland Silesian
Andorra Catalan
India Nepali
Cameroon Ngomba
Iraq Arabic
Tanzania Sangu
Israel Arabic
Liberia Vai
Cape Verde Portuguese
Bolivia Quechua
Mali Koyra Chiini
Lebanon Arabic
 Gusii
Congo - Kinshasa Lingala
 Toki Pona
China Tibetan
Germany Colognian
Libya Arabic
Congo - Brazzaville Lingala
Cameroon Fula
China Tibetan
Tanzania Bena
United States Hawaiian
Central African Republic Lingala
Türkiye Kurdish
Finland Skolt Sami
Belarus Belarusian
Switzerland Portuguese
Brazil Portuguese
Iceland Icelandic
 Kuvi
Macao SAR China Chinese
Namibia Nama
Philippines Cebuano
Pakistan Urdu
Kuwait Arabic
Indonesia Malay
Algeria Kabyle
Türkiye Kurdish
Senegal Wolof
 Low German
Comoros Arabic
Peru Quechua
United Kingdom Welsh
Uganda Ganda
Italy Ligurian
France Catalan
 Punjabi
Iraq Syriac
United Kingdom Scottish Gaelic
Guinea Fula
Nepal Nepali
 Vunjo
India Kuvi
 Langi
 Pijin
Montenegro Serbian
Estonia Estonian
Tajikistan Tajik
Spain Catalan
Uganda Teso
Ukraine Yiddish
Slovakia Slovak
Morocco Arabic
Ghana Ewe
Tanzania Rwa
Bhutan Dzongkha
China Sichuan Yi
Mauritania Arabic
Guinea-Bissau Portuguese
Hungary Hungarian
 Rombo
Kenya Luo
Uzbekistan Uzbek
Cameroon Ewondo
Ethiopia Tigrinya
Greece Greek
Guinea-Bissau Fula
Bangladesh Bengali
Eritrea Tigrinya
Indonesia Sundanese
Russia Chuvash
Palestinian Territories Arabic
Gambia Fula
Singapore Chinese
Guinea Fula
Equatorial Guinea Portuguese
Norway Norwegian
Ghana Fula
 Obolo
Malaysia Malay
Netherlands Western Frisian
Oman Arabic
world Arabic
South Africa Xhosa
Cape Verde Kabuverdianu
Congo - Kinshasa Swahili
Georgia Ossetic
India Bodo
Ecuador Quechua
South Korea Korean
Benin Anii
North Korea Korean
 Ewondo
Slovenia Slovenian
Tanzania Vunjo
Germany Northern Frisian
Pakistan Urdu
Tonga Tongan
Iran Central Kurdish
 Swampy Cree
Mozambique Sena
Iraq Central Kurdish
Taiwan Chinese
Russia Chechen
Cambodia Khmer
Saudi Arabia Arabic
India Tibetan
Russia Moksha
Niger Tasawaq
Ghana Akan
India Sindhi
Italy Catalan
Kenya Taita
Mongolia Mongolian
Liechtenstein Swiss German
Taiwan Chinese
Tanzania Langi
Qatar Arabic
South Africa Xhosa
Ethiopia Tigrinya
Switzerland Walser
Singapore Chinese
Tunisia Arabic
Aruba Dutch
Singapore Malay
India Kuvi
Chad Arabic
 Tasawaq
Croatia Croatian
Slovenia Slovenian
Romania Romanian
Somalia Arabic
Greenland Kalaallisut
Isle of Man Manx
India Rajasthani
 Asu
Nigeria Hausa
 Yangben
Sudan Arabic
New Zealand Māori
Namibia Nama
Syria Arabic
South Sudan Arabic
 Fula
Curaçao Dutch
 Asturian
Belgium English
Mozambique Portuguese
Barbados English
Kenya Swahili
 Kwasio
Norway Norwegian
 Ligurian
Estonia Interlingue
Czechia Czech
Botswana English
Switzerland Swiss German
Macao SAR China Portuguese
Bahamas English
Germany Upper Sorbian
Germany Colognian
India Kashmiri
Bermuda English
Kenya Meru
Italy Lombard
Burundi English
 Hawaiian
world Toki Pona
Antigua & Barbuda English
United Arab Emirates English
 Prussian
 Central Atlas Tamazight
 Ngiemboon
Zimbabwe Shona
Guinea N’Ko
Australia English
Belgium Dutch
Austria English
Cameroon Kwasio
American Samoa English
Luxembourg Portuguese
 Uzbek
Anguilla English
Caribbean Netherlands Dutch
Iran Northern Luri
Diego Garcia English
Kyrgyzstan Kyrgyz
Germany English
 Rwa
Serbia Serbian
Indonesia Sundanese
Tanzania Rombo
Yemen Arabic
 Ngomba
 Lakota
Macao SAR China Chinese
 Walser
Dominica English
world Toki Pona
Denmark English
Switzerland English
Switzerland Italian
India Punjabi
Cocos (Keeling) Islands English
Canada English
India Maithili
Cape Verde Kabuverdianu
Serbia Serbian
Hungary Hungarian
Brazil Portuguese
Zimbabwe Shona
Belize English
Cyprus English
Christmas Island English
 Sundanese
Cameroon Bafia
France Swiss German
Cameroon English
Kazakhstan Kazakh
Cook Islands English
Kenya Samburu
Falkland Islands English
Fiji English
Finland English
India Sindhi
Mali Bambara
United Kingdom Irish
North Macedonia Macedonian
Turkmenistan Turkmen
Kenya Kikuyu
France Occitan
 N’Ko
 Lombard
Russia Ossetic
Poland Silesian
Kenya Taita
Micronesia English
Denmark Faroese
India Odia
Niger Zarma
Sri Lanka Sinhala
Peru Quechua
Cameroon Aghem
Senegal Fula
 Serbian
Kosovo Serbian
Ethiopia Oromo
Eritrea English
Azerbaijan Azerbaijani
Albania Albanian
Togo Ewe
Spain Asturian
Portugal Portuguese
 Bosnian
Cyprus Turkish
Kenya Luyia
Hong Kong SAR China English
Azerbaijan Azerbaijani
Sierra Leone Fula
Mali Koyraboro Senni
Senegal Fula
Ireland Irish
Bhutan Dzongkha
Timor-Leste Portuguese
South Sudan Nuer
Uganda Chiga
São Tomé & Príncipe Portuguese
Kenya Kalenjin
Switzerland Swiss German
Cameroon Ngiemboon
Georgia Georgian
India Telugu
Gambia English
Faroe Islands Faroese
Gibraltar English
Bulgaria Bulgarian
Kenya Samburu
Ghana English
Guernsey English
Nigeria Igbo
Grenada English
Kenya Teso
Switzerland Romansh
United Kingdom English
China Cantonese
Kenya Embu
Cyprus Greek
Guyana English
Guam English
Ukraine Yiddish
Sweden Swedish
Burundi Rundi
 Machame
Jamaica English
Kenya Embu
Iraq Central Kurdish
Kosovo Serbian
Liberia Vai
Jersey English
Kenya Oromo
 Nuer
North Macedonia Macedonian
Finland Inari Sami
France French
Uganda Nyankole
India Hindi
 Taita
Pakistan Punjabi
Congo - Kinshasa Luba-Katanga
Uganda Teso
Philippines Cebuano
South Africa Zulu
 Northern Luri
India Malayalam
South Africa Afrikaans
British Indian Ocean Territory English
India English
Iran Northern Luri
Isle of Man English
Iraq Northern Luri
Israel English
Cameroon Basaa
Italy Italian
Hong Kong SAR China Chinese
Ireland English
Indonesia English
Russia Yakut
Spain Catalan
Norway Norwegian Nynorsk
India Kannada
Burundi Rundi
Kenya Luo
Liberia English
Uganda Swahili
Cameroon Metaʼ
United Kingdom Cornish
Morocco Tachelhit
St Lucia English
Mali Koyra Chiini
Netherlands Dutch
Djibouti Somali
 Yakut
Tanzania Swahili
Tanzania Swahili
Lesotho English
 Samburu
St Kitts & Nevis English
Nigeria Nigerian Pidgin
world Esperanto
 Kuvi
 Santali
Kiribati English
Kenya English
Senegal Jola-Fonyi
world Interlingua
Cameroon Duala
Brazil Kaingang
Belarus Belarusian
Cayman Islands English
Madagascar Malagasy
Kenya Meru
Greece Greek
United Kingdom Welsh
 Sangu
Nauru English
 Nyankole
 Luo
 Filipino
Netherlands English
Congo - Kinshasa Luba-Katanga
Mauritius Morisyen
Vietnam Vietnamese
Nigeria English
Norfolk Island English
Tanzania Machame
 Sindhi
 Luyia
Thailand Thai
 Basaa
New Zealand English
Niue English
Tajikistan Tajik
Montserrat English
Northern Mariana Islands English
Macao SAR China English
 Afrikaans
 Akan
China Cantonese
Marshall Islands English
 Amharic
Madagascar English
Uganda Soga
 Arabic
 Assamese
Namibia English
Mozambique Makhuwa-Meetto
 Azerbaijani
Pakistan Sindhi
Malaysia English
Malawi English
Maldives English
Mauritius English
Ethiopia Somali
India Manipuri
Malta English
 Belarusian
Kenya Kikuyu
Puerto Rico English
 Bulgarian
Pitcairn Islands English
North Macedonia Albanian
 Bambara
Pakistan English
 Bengali
 Tibetan
Philippines English
Papua New Guinea English
 Breton
Sierra Leone Fula
 Bosnian
Senegal Fula
India Kuvi
 Sena
Austria German
New Zealand Māori
United States Hawaiian
 Catalan
Palau English
 Koyraboro Senni
 Chechen
 Kashmiri
Spain Galician
India Tamil
 Czech
India Haryanvi
 Nheengatu
 Chuvash
Cameroon Mundang
Tanzania Rombo
Latvia Latvian
 Welsh
 Danish
 German
Rwanda English
India Telugu
Cameroon Bafia
Kenya Somali
Germany Low German
Georgia Georgian
Liberia Fula
Madagascar Malagasy
Switzerland German
 Bemba
Slovenia English
Sint Maarten Dutch
St Helena English
Singapore English
Sweden English
India Chakma
Sudan English
world Interlingua
 Dzongkha
 Bena
Seychelles English
Solomon Islands English
Sri Lanka Tamil
Vietnam Vietnamese
 Zarma
 Ewe
 Greek
 English
Zambia Bemba
 Esperanto
Belgium German
 Spanish
Suriname Dutch
 Estonian
 Basque
 Fula
 Tachelhit
Namibia Afrikaans
 Upper Sorbian
Tanzania Asu
Cameroon Ngomba
 Persian
 Kuvi
Nigeria Obolo
Venezuela Nheengatu
India Santali
 Bosnian
 Haryanvi
Syria Syriac
 Fula
Tanzania English
Germany Lower Sorbian
 Finnish
Tuvalu English
Trinidad & Tobago English
 Cantonese
 Faroese
Tanzania Bena
Czechia Czech
Tonga English
Bosnia & Herzegovina Serbian
 French
Poland Polish
Tokelau English
Kenya Masai
 Western Frisian
Uganda English
India Bodo
Spain Spanish
Kazakhstan Kazakh
 Irish
Cameroon Aghem
 Scottish Gaelic
Uganda Soga
Morocco Central Atlas Tamazight
Sint Maarten English
Mauritania Fula
 Galician
South Sudan English
 Bhojpuri
Finland Finnish
Brazil Nheengatu
Germany German
Sierra Leone English
 Gujarati
 Manx
Malaysia Tamil
Nigeria Fula
Cameroon Duala
San Marino Italian
Ghana Ewe
India Rajasthani
Russia Tatar
Niger Fula
Turks & Caicos Islands English
 Hausa
India Assamese
 Hebrew
Eswatini English
 Hindi
Uzbekistan Uzbek
Iran Mazanderani
Vanuatu English
Afghanistan Uzbek
Germany Upper Sorbian
 Croatian
Canada Swampy Cree
 Hungarian
 Armenian
Canada Swampy Cree
 Interlingua
 Indonesian
 Interlingue
 Igbo
Russia Yakut
 Sichuan Yi
Montenegro Serbian
Switzerland Walser
Cameroon Kwasio
Laos Lao
Vatican City Italian
 Northern Frisian
United States English
Cambodia Khmer
 Icelandic
Kenya Luyia
world English
 Italian
US Outlying Islands English
Georgia Ossetic
France Breton
US Virgin Islands English
British Virgin Islands English
 Japanese
Liberia Vai
St Vincent & the Grenadines English
Poland Prussian
 Dogri
Russia Moksha
Italy German
Türkiye Turkish
 Javanese
Luxembourg Luxembourgish
 Kashmiri
 Sindhi
Brazil Spanish
Hong Kong SAR China Cantonese
Tanzania Shambala
 Maithili
Bolivia Spanish
 Inari Sami
 Georgian
 Skolt Sami
Bulgaria Bulgarian
Afghanistan Pashto
 Masai
 Kikuyu
 Kazakh
 Kalaallisut
Poland Prussian
 Khmer
 Kannada
 Korean
 Anii
 Kashmiri
 Kurdish
Samoa English
 Cornish
 Kyrgyz
South Africa Zulu
Argentina Spanish
Spain Basque
Somalia Somali
 Luxembourgish
Egypt Arabic
 Ganda
Guinea N’Ko
 Lingala
 Friulian
Central African Republic Sango
 Lao
Tanzania Rwa
Mozambique Sena
Tanzania Langi
 Lithuanian
 Luba-Katanga
Zimbabwe English
 Latvian
India Kangri
Somalia Somali
Cameroon Yangben
Tanzania Asu
Germany Low German
Cuba Spanish
Liechtenstein German
Senegal Jola-Fonyi
France Occitan
Luxembourg Luxembourgish
Kenya Gusii
Dominican Republic Spanish
 Malagasy
 Māori
 Macedonian
 Malayalam
Bangladesh Bengali
 Mongolian
 Marathi
 Malay
 Maltese
Belize Spanish
 Burmese
 Moksha
United States Cherokee
Spain Occitan
 Lower Sorbian
Costa Rica Spanish
Zambia English
 Norwegian Bokmål
Colombia Spanish
 North Ndebele
 Nepali
Singapore Tamil
Chile Spanish
India Marathi
Malta Maltese
Afghanistan Uzbek
 Dutch
South Africa English
 Norwegian Nynorsk
 Norwegian
Japan Japanese
Italy Lombard
Armenia Armenian
Netherlands Low German
Solomon Islands Pijin
Finland Finnish
Ireland Irish
Japan Japanese
 Kabyle
 Occitan
 Kamba
India Hindi
 Meru
Morocco Central Atlas Tamazight
 Oromo
 Odia
Ecuador Spanish
 Ossetic
Kosovo Albanian
Malaysia Malay
Luxembourg German
Ceuta & Melilla Spanish
Benin Yoruba
Kenya Kalenjin
China Zhuang
Denmark Danish
Zimbabwe North Ndebele
Åland Islands Swedish
 Morisyen
India Punjabi
Belarus Russian
 Punjabi
 Duala
Bangladesh Chakma
Spain Spanish
Germany Northern Frisian
Malta Maltese
Ethiopia Amharic
Norway Norwegian Nynorsk
India Kannada
 Polish
Congo - Brazzaville French
Benin Anii
Switzerland French
Côte d’Ivoire French
 Pashto
 Portuguese
Cameroon French
Cameroon Kako
Central African Republic Sango
 Azerbaijani
Tanzania Masai
Laos Lao
Mozambique Makhuwa-Meetto
Greenland Danish
 Makhuwa-Meetto
Afghanistan Persian
Philippines Filipino
 Metaʼ
United States Lakota
Tanzania Shambala
Canada French
Honduras Spanish
Congo - Kinshasa French
Central African Republic French
Azerbaijan Azerbaijani
Burkina Faso French
South Africa Afrikaans
Burundi French
 Quechua
Benin French
St Barthélemy French
 Bodo
 Makonde
Greenland Kalaallisut
Guatemala Spanish
Equatorial Guinea Spanish
 Romansh
 Rundi
 Romanian
Belgium French
 Russian
Kenya Gusii
 Kinyarwanda
Burkina Faso Fula
Norway Norwegian Bokmål
 Kabuverdianu
United Kingdom Scottish Gaelic
Nigeria Nigerian Pidgin
China Uyghur
 Sanskrit
 Sardinian
Spain Galician
Finland Swedish
Netherlands Dutch
 Sindhi
 Northern Sami
Algeria French
Isle of Man Manx
 Sango
 Sinhala
 Slovak
 Slovenian
 Shona
India Bhojpuri
Italy Ligurian
 Somali
 Albanian
 Serbian
India Bengali
Sri Lanka Sinhala
 Sundanese
Djibouti French
 Swedish
 Swahili
Canary Islands Spanish
 Tamil
Bosnia & Herzegovina Bosnian
 Telugu
 Tajik
 Thai
Mozambique Makhuwa
 Tigrinya
 Turkmen
 Greek
Iraq Syriac
 Tongan
 Jola-Fonyi
India Odia
 Turkish
United States English
 Tatar
Guinea French
Turkmenistan Turkmen
Slovakia Slovak
Guadeloupe French
Equatorial Guinea French
United States Lakota
India Kashmiri
Afghanistan Pashto
 Uyghur
Nigeria Igbo
Macao SAR China Chinese
 Kaingang
 Ukrainian
Gabon French
French Guiana French
 Urdu
Finland Northern Sami
India Gujarati
 Uzbek
Spain Basque
Ghana Akan
France French
Israel Hebrew
India Assamese
 Vietnamese
 Chinese
 Koyra Chiini
 Chinese
Algeria Kabyle
Mauritius Morisyen
 Serbian
Burkina Faso Fula
Colombia Nheengatu
Zambia Bemba
Nicaragua Spanish
Kazakhstan Russian
 Syriac
Nigeria Obolo
Israel Hebrew
Italy Friulian
India Bhojpuri
Myanmar (Burma) Burmese
Lithuania Lithuanian
 Wolof
 Standard Moroccan Tamazight
Brazil Nheengatu
Spain Asturian
Cameroon Ewondo
Tanzania Vunjo
Tanzania Machame
Cameroon Kako
 Silesian
Haiti French
 Manipuri
Kyrgyzstan Russian
Bosnia & Herzegovina Serbian
Cameroon Basaa
Italy Venetian
 Xhosa
 Cantonese
Mexico Spanish
Bosnia & Herzegovina Croatian
Estonia Estonian
 Cantonese
India Hindi
Pakistan Punjabi
Senegal Wolof
Philippines Spanish
Pakistan Pashto
 Kako
Iran Persian
Peru Spanish
Türkiye Turkish
Pakistan Sindhi
Cameroon Metaʼ
 Yiddish
 Yoruba
India Maithili
Paraguay Spanish
India Manipuri
Comoros French
Puerto Rico Spanish
 Vai
China Zhuang
Guinea Fula
 Zhuang
Gambia Fula
India Marathi
Ghana Fula
Bangladesh Chakma
 Kalenjin
 Chinese
Moldova Russian
Panama Spanish
Mongolia Mongolian
Solomon Islands Pijin
India Malayalam
Svalbard & Jan Mayen Norwegian Bokmål
Guinea-Bissau Fula
Denmark Danish
Serbia and Montenegro Serbian
 Zulu
Zimbabwe North Ndebele
Martinique French
Mauritania French
Mauritius French
Indonesia Indonesian
Morocco Standard Moroccan Tamazight
Italy Sardinian
Morocco French
 Vai
Monaco French
St Martin French
Indonesia Javanese
Madagascar French
India Dogri
Norway Northern Sami
Mali French
India Tamil
Kenya Kamba
Italy Sardinian
Indonesia Javanese
Luxembourg French
Albania Albanian
Norway Norwegian
Iran Mazanderani
United Kingdom Cornish
Hong Kong SAR China Chinese
Nigeria Yoruba
Kyrgyzstan Kyrgyz
 Embu
South Korea Korean
Rwanda Kinyarwanda
 Konkani
China Sichuan Yi
Cameroon Ngiemboon
China Uyghur
United States Cherokee
Germany German
Ukraine Ukrainian
 Venetian
 Manipuri
Tanzania Makonde
Tanzania Makonde
Estonia Interlingue
Cameroon Fula
Croatia Croatian
Russia Chuvash
Norway Northern Sami
Philippines Filipino
Ghana Hausa
New Caledonia French
India Kuvi
Niger French
 Mundang
 Tachelhit
El Salvador Spanish
Sweden Swedish
Uganda Ganda
India Sanskrit
Indonesia Indonesian
Bosnia & Herzegovina Bosnian
China Chinese
Réunion French
Hong Kong SAR China Cantonese
Cameroon Mundang
Switzerland Romansh
Iran Persian
 Uzbek
Norway Norwegian Bokmål
Russia Tatar
Thailand Thai
India Kuvi
United States Spanish
Iceland Icelandic
Cameroon Yangben
United States English
Thailand Thai
Venezuela Spanish
French Polynesia French
Russia Russian
Uganda Chiga
Mali Koyraboro Senni
India Haryanvi
India Dogri
St Pierre & Miquelon French
 Shambala
Uruguay Spanish
India Gujarati
 Bafia

 */
