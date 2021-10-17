package aoc2018

import aoc2018.day17.day17ReservoirResearch
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class Aoc2018Day17KtTest {
    @Test
    fun testLow() {
        day17ReservoirResearch(
            """x=495, y=2..7
y=7, x=495..501
x=501, y=3..7
x=498, y=2..4
x=506, y=1..2
x=498, y=10..13
x=504, y=10..13
y=13, x=498..504"""
        ) shouldBe (57 to 29)
    }

    @Test
    fun test() {
        day17ReservoirResearch(INPUT) shouldBe (33362 to 27801)
    }

}

private const val INPUT = """x=402, y=102..117
x=377, y=393..396
y=105, x=454..476
x=401, y=1689..1698
x=613, y=571..594
y=357, x=381..396
x=511, y=1831..1834
y=1698, x=401..404
y=782, x=446..454
y=1543, x=386..389
x=458, y=1385..1389
y=1295, x=380..384
x=504, y=768..790
x=603, y=307..317
x=532, y=1700..1706
x=426, y=1246..1259
x=444, y=406..410
y=1398, x=393..398
x=492, y=33..35
x=487, y=1306..1311
y=1603, x=417..436
y=1482, x=397..402
x=406, y=484..506
x=428, y=1048..1061
y=887, x=364..384
x=427, y=1557..1567
y=944, x=521..524
x=504, y=1981..2000
x=459, y=500..510
y=1425, x=332..356
x=594, y=869..886
x=445, y=970..987
x=514, y=1345..1366
x=457, y=1686..1688
x=579, y=1517..1526
x=368, y=1034..1037
y=542, x=577..604
x=410, y=419..441
y=1164, x=402..404
x=594, y=305..312
x=418, y=662..677
x=444, y=872..887
x=510, y=431..436
x=477, y=1755..1766
x=544, y=216..229
x=381, y=1973..1983
y=1879, x=373..389
y=235, x=355..370
x=526, y=261..272
x=402, y=1307..1317
x=464, y=1660..1683
y=1705, x=393..411
x=476, y=99..105
y=884, x=450..454
y=1058, x=419..422
x=542, y=979..993
x=381, y=1536..1548
x=506, y=1484..1491
x=392, y=1456..1467
x=415, y=1243..1256
y=1084, x=393..410
x=404, y=445..447
x=382, y=1992..2004
x=520, y=72..84
x=566, y=1606..1610
y=673, x=341..349
y=1694, x=538..552
x=577, y=1606..1612
x=461, y=872..887
x=415, y=1093..1104
y=822, x=525..527
x=524, y=944..947
x=400, y=138..160
y=1810, x=584..591
x=428, y=1334..1343
x=522, y=100..104
x=406, y=1817..1818
x=393, y=1116..1127
y=355, x=339..366
y=246, x=543..556
x=368, y=1686..1714
x=402, y=1884..1896
y=1080, x=433..435
y=1646, x=366..386
x=447, y=107..123
x=581, y=595..612
y=944, x=593..609
x=538, y=714..727
x=393, y=1287..1298
y=950, x=515..536
x=473, y=1034..1039
x=339, y=1391..1402
x=588, y=567..591
x=400, y=746..757
x=584, y=308..317
x=403, y=561..574
y=46, x=402..412
x=500, y=1816..1840
x=590, y=1926..1941
x=370, y=211..235
y=665, x=388..398
y=1390, x=560..588
y=656, x=440..457
x=529, y=1205..1229
x=449, y=1414..1416
y=1229, x=508..529
y=1612, x=577..582
x=402, y=1931..1944
y=1236, x=410..430
x=594, y=951..975
x=457, y=1939..1956
x=557, y=106..124
y=1512, x=470..482
y=1674, x=540..551
y=297, x=360..362
x=596, y=725..752
y=1401, x=384..406
y=407, x=467..492
x=494, y=1629..1640
x=402, y=1657..1661
y=598, x=344..355
y=979, x=342..351
x=371, y=1315..1324
x=583, y=467..477
x=344, y=584..598
x=598, y=425..431
x=436, y=157..174
x=406, y=1651..1663
x=560, y=1264..1289
x=419, y=498..503
x=559, y=414..434
x=383, y=103..117
x=495, y=876..887
x=388, y=1008..1021
x=532, y=734..750
x=469, y=1319..1336
x=471, y=1754..1766
x=503, y=1464..1480
x=502, y=484..494
y=1526, x=558..579
x=333, y=868..887
y=1561, x=507..509
x=534, y=394..416
x=455, y=1058..1065
x=348, y=1455..1461
y=1987, x=420..443
x=602, y=1669..1673
y=582, x=563..565
y=1395, x=361..366
x=580, y=1454..1463
x=425, y=21..23
x=427, y=1779..1787
x=528, y=100..104
x=471, y=68..88
x=522, y=849..861
y=1709, x=585..613
y=1041, x=412..432
y=991, x=575..585
x=434, y=53..61
x=451, y=537..549
x=480, y=47..51
y=1166, x=483..490
x=350, y=396..397
y=84, x=500..520
x=343, y=716..726
y=1127, x=508..511
x=487, y=837..847
x=491, y=48..62
x=530, y=1663..1672
x=393, y=1691..1705
x=485, y=1318..1336
y=506, x=397..406
y=1837, x=443..449
y=434, x=559..579
y=664, x=541..543
y=1966, x=370..389
y=1106, x=532..537
x=406, y=1960..1962
y=1034, x=573..596
x=370, y=1737..1760
x=346, y=287..310
x=370, y=1252..1255
y=573, x=429..452
y=1298, x=374..393
x=400, y=1343..1352
x=378, y=872..879
y=1268, x=485..494
y=186, x=529..548
x=573, y=1018..1034
x=523, y=604..606
x=573, y=1999..2016
x=374, y=1758..1772
y=1896, x=400..402
y=1289, x=523..527
x=425, y=747..757
y=1669, x=609..611
x=484, y=522..524
y=999, x=461..464
x=407, y=982..994
x=501, y=1248..1261
y=1446, x=364..380
y=1902, x=539..547
x=373, y=1796..1815
x=334, y=669..679
y=1855, x=466..490
x=434, y=685..696
x=598, y=951..975
y=1320, x=538..543
x=414, y=1478..1506
x=407, y=303..318
x=564, y=1618..1629
x=475, y=1307..1311
x=504, y=1759..1764
x=548, y=559..579
x=537, y=1133..1140
y=988, x=557..563
y=422, x=486..498
y=65, x=382..390
x=335, y=1056..1068
y=1795, x=419..439
x=432, y=1031..1041
x=387, y=373..399
x=384, y=875..887
y=1339, x=558..565
x=389, y=242..269
x=532, y=1092..1106
x=424, y=1029..1038
x=387, y=1345..1358
x=409, y=1189..1191
x=424, y=108..123
y=396, x=377..380
x=574, y=220..230
x=424, y=1824..1834
x=466, y=795..806
x=336, y=1892..1901
y=1478, x=336..350
x=520, y=286..298
x=448, y=937..963
x=402, y=650..677
x=527, y=819..822
x=398, y=1343..1352
x=600, y=620..634
y=1881, x=565..589
x=393, y=1560..1573
y=1901, x=336..341
x=353, y=1027..1049
x=474, y=1279..1283
x=549, y=1938..1944
x=429, y=1711..1715
x=395, y=398..401
y=1766, x=471..477
x=442, y=499..503
x=409, y=1786..1789
x=395, y=1671..1682
x=384, y=855..866
y=1749, x=385..408
x=406, y=1390..1401
x=364, y=874..887
y=729, x=437..441
x=426, y=1650..1663
y=83, x=391..419
y=1785, x=474..485
y=1592, x=487..510
y=1223, x=558..563
y=1818, x=378..406
x=539, y=1902..1908
x=390, y=1322..1329
x=373, y=1093..1094
x=575, y=807..812
x=603, y=1201..1209
x=530, y=1763..1770
y=1416, x=449..462
y=887, x=444..461
x=460, y=792..799
x=385, y=1739..1749
y=993, x=542..570
y=1259, x=408..426
y=912, x=587..593
x=508, y=1111..1127
y=744, x=576..582
x=548, y=1724..1747
x=455, y=626..637
y=2034, x=444..471
x=489, y=278..289
x=564, y=757..762
y=104, x=522..528
y=1815, x=359..373
x=435, y=362..381
x=587, y=1025..1028
x=485, y=1265..1268
y=1592, x=337..345
y=529, x=446..469
x=374, y=1288..1298
x=520, y=966..973
y=1381, x=397..419
x=534, y=95..109
x=393, y=108..112
x=359, y=1795..1815
x=558, y=1518..1526
x=590, y=1340..1366
x=563, y=986..988
y=616, x=455..478
y=1840, x=500..517
y=1037, x=360..368
y=1038, x=424..426
y=1908, x=539..547
x=593, y=840..855
x=588, y=195..207
x=602, y=15..29
x=517, y=1106..1134
x=450, y=1921..1923
x=401, y=881..901
x=386, y=941..954
x=399, y=966..975
y=606, x=520..523
y=612, x=575..581
y=1786, x=572..574
y=1102, x=541..563
x=544, y=2032..2054
x=459, y=746..755
x=453, y=1623..1624
y=1393, x=491..513
x=498, y=462..471
x=384, y=1325..1335
y=595, x=534..538
x=570, y=980..993
y=1008, x=358..375
x=408, y=521..535
x=401, y=1182..1194
x=388, y=303..318
x=490, y=443..454
x=590, y=1826..1839
x=370, y=259..273
x=346, y=788..813
x=348, y=751..762
x=410, y=1828..1830
y=1004, x=365..369
x=571, y=13..38
x=478, y=606..616
x=604, y=870..886
x=437, y=1417..1419
y=1076, x=400..402
y=879, x=373..378
x=463, y=523..525
y=1487, x=392..409
x=604, y=527..542
y=504, x=378..391
x=509, y=464..474
y=1562, x=522..544
x=337, y=1455..1461
x=437, y=196..205
x=433, y=1366..1368
x=543, y=637..664
y=515, x=340..361
x=449, y=1822..1837
y=844, x=333..359
x=526, y=1633..1652
y=912, x=394..396
x=388, y=346..353
y=701, x=527..532
y=653, x=449..451
x=515, y=937..950
x=340, y=716..726
x=574, y=1723..1747
x=389, y=1909..1920
x=454, y=295..307
x=333, y=1849..1874
x=378, y=1848..1853
x=362, y=1751..1757
y=1403, x=521..546
y=1317, x=387..402
y=1880, x=486..509
x=545, y=1242..1250
x=493, y=1247..1261
y=1315, x=369..371
x=486, y=422..426
y=762, x=348..364
y=1427, x=526..549
x=346, y=5..12
y=1553, x=518..538
x=341, y=1891..1901
x=401, y=1113..1124
y=1925, x=502..506
y=136, x=608..612
x=419, y=1759..1772
y=975, x=594..598
x=555, y=1897..1914
y=1682, x=395..416
x=408, y=1610..1613
x=585, y=1339..1366
x=518, y=1764..1770
y=552, x=444..461
x=526, y=455..477
x=521, y=215..229
y=16, x=419..442
x=499, y=28..39
y=230, x=574..588
y=1950, x=601..605
y=16, x=552..560
x=364, y=752..762
y=813, x=346..359
x=467, y=1729..1744
y=1863, x=581..585
x=398, y=660..665
x=560, y=1742..1744
x=601, y=1537..1540
y=1203, x=547..574
x=446, y=583..595
x=400, y=1271..1273
y=504, x=350..353
y=484, x=445..451
x=582, y=1200..1209
x=562, y=632..634
x=601, y=1950..1952
x=455, y=607..616
x=386, y=1494..1506
y=111, x=564..592
y=86, x=526..529
x=513, y=2039..2054
x=510, y=1067..1085
y=1277, x=336..359
x=500, y=169..174
x=402, y=137..160
x=417, y=1449..1451
x=588, y=634..639
x=490, y=1839..1855
y=588, x=496..523
y=431, x=596..598
y=826, x=406..477
x=382, y=1581..1606
x=519, y=1483..1491
x=369, y=1455..1467
x=457, y=792..799
x=592, y=94..111
x=469, y=519..529
x=337, y=1587..1592
y=1830, x=410..414
x=369, y=2015..2019
x=401, y=709..711
y=1899, x=389..408
y=1757, x=359..362
x=408, y=1559..1573
x=439, y=1725..1750
x=439, y=625..637
x=465, y=1687..1688
x=539, y=1394..1398
x=523, y=1281..1289
y=672, x=492..518
x=600, y=1556..1560
x=455, y=938..963
x=511, y=875..887
y=207, x=572..588
x=457, y=1180..1203
x=528, y=773..789
y=750, x=532..555
x=507, y=310..321
y=927, x=341..365
y=1717, x=459..465
y=1640, x=517..520
x=539, y=179..182
x=425, y=894..897
x=489, y=522..524
x=406, y=612..621
x=520, y=117..131
x=450, y=1057..1065
y=1760, x=342..370
x=361, y=493..515
x=365, y=906..927
x=615, y=499..510
y=1610, x=563..566
x=568, y=598..609
x=444, y=539..552
y=353, x=388..390
y=179, x=535..539
x=340, y=494..515
x=521, y=1376..1403
x=564, y=1453..1463
x=396, y=898..912
x=445, y=460..484
x=582, y=741..744
y=319, x=537..549
x=359, y=1751..1757
x=492, y=1522..1546
x=446, y=520..529
y=1343, x=428..452
x=532, y=675..701
x=424, y=706..719
x=374, y=1252..1255
x=502, y=1982..2000
x=593, y=1826..1839
y=696, x=434..476
y=711, x=401..403
x=341, y=685..707
y=1502, x=438..440
x=480, y=1728..1744
x=342, y=1738..1760
y=579, x=548..554
x=547, y=1188..1203
x=385, y=774..775
x=540, y=1606..1628
x=563, y=1606..1610
x=375, y=984..1008
x=335, y=1486..1498
y=648, x=419..425
y=29, x=602..613
y=1261, x=493..501
x=414, y=726..737
y=169, x=468..482
x=524, y=261..272
x=341, y=673..675
x=560, y=1381..1390
x=560, y=107..124
x=609, y=1650..1669
x=367, y=374..399
x=501, y=621..645
x=513, y=1759..1764
y=1021, x=388..412
x=546, y=467..473
y=1847, x=532..537
x=571, y=239..252
x=520, y=605..606
y=2047, x=580..594
x=611, y=1649..1669
x=561, y=906..915
x=564, y=93..111
x=464, y=746..755
x=448, y=1549..1568
y=83, x=359..362
y=1772, x=374..419
x=566, y=1998..2016
x=333, y=821..844
x=437, y=729..733
x=391, y=495..504
y=1523, x=399..402
x=584, y=55..70
y=1490, x=559..575
x=585, y=1703..1709
x=383, y=611..621
y=1874, x=333..337
x=570, y=1671..1686
y=1977, x=333..346
y=1976, x=515..537
x=517, y=535..560
x=482, y=141..169
x=471, y=804..813
x=548, y=632..634
x=538, y=195..206
y=524, x=484..489
x=586, y=667..669
y=404, x=474..477
y=1598, x=385..402
x=559, y=1484..1490
y=882, x=555..569
y=813, x=471..495
y=737, x=414..453
y=334, x=374..379
x=440, y=646..656
y=229, x=521..544
x=542, y=1211..1228
x=346, y=1301..1314
y=1455, x=510..536
x=593, y=780..781
x=486, y=1876..1880
x=537, y=160..169
x=426, y=1135..1148
y=1149, x=344..351
x=350, y=187..191
x=573, y=1763..1768
y=886, x=594..604
x=503, y=935..948
y=1948, x=411..423
x=581, y=1854..1863
x=538, y=568..595
y=1754, x=535..539
x=470, y=1050..1074
y=1366, x=514..519
y=1457, x=571..573
y=494, x=502..521
x=611, y=1616..1639
x=428, y=936..946
y=1419, x=429..437
y=204, x=495..500
x=356, y=1344..1353
y=1839, x=590..593
x=560, y=1617..1629
x=399, y=1515..1523
x=484, y=1049..1074
x=411, y=99..126
x=339, y=882..884
x=509, y=1831..1834
y=1061, x=410..428
y=1829, x=384..398
x=608, y=1889..1917
y=651, x=591..609
y=633, x=445..447
x=361, y=1392..1395
x=563, y=1090..1102
x=527, y=1579..1597
x=543, y=1294..1320
x=379, y=773..775
y=1652, x=511..526
x=512, y=487..490
y=637, x=439..455
y=255, x=519..525
y=1629, x=560..564
x=377, y=1053..1078
x=539, y=1015..1038
x=382, y=50..65
x=414, y=1648..1658
x=486, y=33..35
x=593, y=1061..1071
x=558, y=195..206
x=574, y=1187..1203
x=451, y=1776..1802
y=2028, x=397..410
x=462, y=1301..1308
x=533, y=2024..2027
y=1670, x=434..439
x=391, y=71..83
x=579, y=202..204
x=417, y=1577..1603
x=429, y=1849..1868
x=353, y=504..507
x=369, y=1668..1680
y=1295, x=419..434
x=586, y=1295..1306
y=855, x=593..601
x=358, y=983..1008
y=132, x=574..591
x=486, y=1629..1640
y=1506, x=383..386
x=404, y=936..946
y=1688, x=457..465
x=544, y=1560..1562
x=525, y=235..255
x=401, y=2031..2041
x=438, y=1476..1502
x=383, y=1863..1871
x=406, y=1271..1273
x=423, y=296..324
x=410, y=1870..1876
y=2022, x=354..389
x=542, y=29..48
x=417, y=1222..1232
x=447, y=1712..1715
x=597, y=1889..1917
y=1853, x=376..378
x=447, y=21..23
x=373, y=1717..1730
x=583, y=1295..1306
y=2003, x=536..547
x=409, y=1441..1458
y=1770, x=518..530
x=533, y=239..252
x=509, y=1725..1730
x=380, y=393..396
y=1324, x=369..371
x=583, y=1109..1125
x=425, y=1627..1640
x=479, y=1450..1476
y=1010, x=338..352
y=35, x=486..492
x=551, y=1669..1674
y=926, x=396..416
x=554, y=306..319
x=493, y=465..474
x=565, y=560..582
y=62, x=491..511
x=426, y=1096..1107
y=847, x=392..487
x=555, y=735..750
y=1593, x=394..396
y=1616, x=394..414
y=1750, x=423..439
x=577, y=1111..1119
x=541, y=638..664
y=1765, x=431..439
y=666, x=578..583
x=358, y=668..679
x=503, y=1303..1328
x=415, y=881..901
x=387, y=1975..1986
x=609, y=929..944
y=704, x=481..487
x=522, y=966..973
x=559, y=779..801
x=529, y=176..186
y=1658, x=414..417
y=1636, x=517..520
y=1956, x=596..612
x=461, y=1246..1248
x=332, y=1412..1425
x=408, y=1886..1899
x=502, y=1921..1925
x=481, y=1845..1851
x=377, y=1306..1327
x=505, y=920..930
x=542, y=1653..1660
x=333, y=1954..1977
y=307, x=454..476
x=513, y=1385..1393
x=511, y=1090..1093
x=525, y=819..822
y=249, x=543..556
x=570, y=327..341
x=372, y=737..754
x=408, y=1245..1259
x=343, y=684..707
y=677, x=418..438
x=387, y=1307..1317
x=476, y=517..528
y=1071, x=593..613
x=592, y=1679..1694
x=418, y=1181..1194
x=452, y=1333..1343
y=1329, x=390..393
x=376, y=1383..1398
x=338, y=986..1010
x=535, y=1241..1250
x=459, y=1254..1265
y=324, x=417..423
x=436, y=1806..1817
x=373, y=1411..1423
x=549, y=831..848
x=526, y=1860..1875
y=561, x=337..364
x=605, y=779..781
y=639, x=576..588
y=528, x=476..498
x=384, y=1846..1857
y=503, x=419..442
y=1352, x=398..400
x=581, y=906..915
x=358, y=1687..1714
y=12, x=346..359
y=1498, x=335..362
x=402, y=1568..1570
x=404, y=1324..1335
x=366, y=1392..1395
x=393, y=1393..1398
y=1875, x=422..443
y=2016, x=566..573
x=499, y=118..131
x=596, y=1931..1956
x=378, y=496..504
y=1968, x=488..497
x=439, y=940..956
x=479, y=898..910
x=527, y=675..701
y=1660, x=542..555
y=510, x=459..615
y=765, x=381..383
y=1448, x=348..352
x=355, y=212..235
y=1730, x=373..393
x=416, y=1845..1858
y=261, x=436..463
x=488, y=711..717
x=468, y=1661..1683
x=487, y=138..151
x=366, y=327..355
x=375, y=259..273
x=584, y=286..298
x=598, y=1617..1639
y=1962, x=406..426
y=447, x=404..430
x=583, y=647..666
x=588, y=1382..1390
x=461, y=540..552
y=1742, x=560..563
x=498, y=518..528
y=1480, x=495..503
y=1817, x=417..436
y=167, x=390..395
x=536, y=28..48
x=423, y=1921..1948
y=160, x=400..402
x=422, y=842..844
y=762, x=564..589
x=368, y=785..795
y=1074, x=470..484
x=519, y=1345..1366
y=1409, x=574..595
x=429, y=520..535
y=91, x=428..452
x=386, y=1642..1646
x=578, y=1082..1085
x=410, y=231..244
x=493, y=353..365
x=337, y=1848..1874
x=509, y=487..490
x=568, y=1179..1182
y=1366, x=585..590
x=382, y=278..293
y=432, x=479..505
x=471, y=47..51
x=441, y=970..987
x=558, y=442..465
y=733, x=437..441
x=364, y=1434..1446
x=459, y=1533..1542
x=489, y=896..904
x=446, y=223..230
x=400, y=1568..1570
x=456, y=405..410
y=617, x=359..375
x=446, y=665..677
y=1506, x=414..433
y=1983, x=378..381
x=376, y=1848..1853
y=174, x=436..454
x=402, y=1475..1482
y=1458, x=409..425
x=463, y=239..261
y=51, x=471..480
x=496, y=1087..1100
y=252, x=533..571
x=461, y=1922..1923
y=1343, x=558..565
x=574, y=128..132
x=486, y=2024..2028
x=528, y=959..976
x=536, y=1394..1398
x=581, y=567..590
x=490, y=1158..1166
y=1232, x=571..596
x=589, y=1878..1881
x=466, y=665..677
y=507, x=350..353
y=2019, x=369..377
x=510, y=10..20
x=454, y=1253..1265
y=1706, x=506..532
x=560, y=5..16
x=576, y=741..744
y=719, x=424..443
y=1036, x=374..382
y=954, x=364..386
y=23, x=425..447
x=424, y=1155..1172
y=677, x=402..413
y=621, x=383..406
y=1545, x=386..389
y=861, x=504..522
x=468, y=1180..1203
y=1461, x=337..348
x=536, y=1446..1455
y=1573, x=393..408
x=596, y=1221..1232
x=558, y=405..407
x=354, y=395..397
x=571, y=1370..1377
x=555, y=1163..1166
x=525, y=1091..1093
y=1171, x=394..410
x=419, y=773..785
y=915, x=561..581
x=496, y=330..333
y=1715, x=429..447
x=613, y=1829..1856
x=606, y=1645..1647
y=1714, x=358..368
y=1078, x=363..377
x=400, y=1068..1076
x=515, y=1967..1976
y=557, x=434..438
x=570, y=778..801
x=341, y=906..927
y=844, x=422..457
x=435, y=895..897
x=426, y=1029..1038
x=372, y=1588..1591
x=596, y=1670..1673
x=461, y=523..525
x=492, y=394..407
y=1730, x=503..509
y=1683, x=464..468
x=394, y=1606..1616
x=526, y=62..86
x=597, y=327..341
y=88, x=459..471
x=564, y=1083..1085
x=404, y=1991..2004
y=1143, x=417..420
y=1917, x=597..608
x=536, y=938..950
y=341, x=570..597
y=987, x=441..445
y=1353, x=350..356
x=348, y=1436..1448
y=1191, x=406..409
x=474, y=398..404
y=534, x=587..589
x=571, y=1222..1232
y=1768, x=557..573
y=2027, x=524..533
y=1476, x=479..490
y=752, x=569..596
x=543, y=246..249
x=590, y=1025..1028
y=1895, x=483..500
x=384, y=1824..1829
x=521, y=485..494
x=430, y=445..447
x=471, y=2007..2034
x=412, y=1009..1021
x=464, y=996..999
y=775, x=379..385
y=1104, x=415..420
x=502, y=1663..1672
x=383, y=1494..1506
x=376, y=527..538
x=359, y=789..813
x=359, y=822..844
x=402, y=1585..1598
y=522, x=484..489
x=342, y=407..431
x=507, y=1546..1561
x=428, y=475..494
y=1203, x=457..468
y=1612, x=491..506
x=523, y=573..588
x=446, y=776..782
y=897, x=425..435
x=526, y=1041..1058
x=351, y=1026..1049
y=131, x=499..520
x=410, y=1070..1084
x=543, y=710..722
x=365, y=597..609
x=486, y=896..904
x=415, y=955..968
x=428, y=1803..1813
x=538, y=1534..1553
x=459, y=1599..1626
x=534, y=569..595
x=352, y=985..1010
y=1613, x=402..408
x=438, y=224..230
y=795, x=368..376
x=537, y=1091..1106
y=1306, x=583..586
x=460, y=672..674
x=453, y=1968..1979
x=518, y=660..672
x=496, y=573..588
x=409, y=52..61
y=1406, x=582..584
y=1283, x=474..481
x=509, y=1877..1880
y=494, x=428..442
x=374, y=321..334
x=429, y=1268..1273
x=546, y=1376..1403
x=479, y=418..432
y=1273, x=429..455
x=350, y=504..507
x=419, y=13..16
x=476, y=211..213
y=975, x=355..399
x=575, y=1111..1119
x=360, y=291..297
x=562, y=159..169
x=410, y=2025..2028
y=365, x=493..580
x=485, y=1177..1191
x=486, y=1533..1542
y=1923, x=450..461
y=717, x=596..606
x=606, y=698..717
y=1944, x=427..431
y=70, x=569..584
x=506, y=2040..2054
y=781, x=593..605
y=897, x=515..527
y=976, x=511..528
x=396, y=341..357
x=566, y=1771..1795
y=1639, x=598..611
x=412, y=35..46
x=369, y=597..609
x=511, y=1111..1127
x=435, y=1062..1080
y=195, x=336..364
x=495, y=855..866
x=522, y=1561..1562
x=415, y=1449..1451
x=408, y=98..126
y=454, x=490..507
x=517, y=1816..1840
x=506, y=1600..1612
x=433, y=1479..1506
x=453, y=726..737
x=409, y=689..714
x=541, y=1091..1102
x=393, y=1322..1329
x=500, y=873..884
x=371, y=64..86
y=1527, x=392..409
x=399, y=1537..1548
x=529, y=1005..1027
y=1058, x=500..526
x=429, y=1416..1419
x=444, y=161..164
y=1398, x=536..539
y=1544, x=524..528
y=1956, x=457..481
x=495, y=1463..1480
y=1308, x=462..469
y=896, x=542..544
x=521, y=944..947
x=420, y=389..403
x=389, y=217..231
x=346, y=1953..1977
y=2000, x=502..504
x=584, y=1537..1540
x=452, y=72..91
x=601, y=661..670
y=1232, x=417..420
x=389, y=1865..1879
y=1744, x=467..480
x=465, y=299..303
x=582, y=1605..1612
x=455, y=1549..1568
x=443, y=1628..1634
y=191, x=344..350
x=394, y=898..912
y=112, x=388..393
x=410, y=1203..1215
x=438, y=661..677
x=432, y=941..956
x=513, y=395..416
x=373, y=921..930
x=379, y=322..334
x=439, y=390..403
y=1125, x=568..583
x=494, y=1266..1268
y=1694, x=582..592
x=382, y=701..711
x=354, y=2012..2022
y=317, x=584..603
x=451, y=459..484
x=469, y=1302..1308
x=443, y=1975..1987
y=436, x=510..538
y=474, x=493..509
x=476, y=296..307
y=1093, x=511..525
x=469, y=1088..1100
x=587, y=531..534
x=472, y=709..734
x=447, y=623..633
x=419, y=637..648
x=510, y=1446..1455
x=558, y=1214..1223
x=598, y=667..669
x=451, y=644..653
x=383, y=1906..1917
x=445, y=623..633
x=539, y=467..473
y=441, x=404..410
x=363, y=1242..1261
x=408, y=399..401
y=72, x=602..609
y=1377, x=550..571
x=431, y=1779..1787
x=572, y=1783..1786
x=377, y=2015..2019
x=507, y=444..454
x=495, y=805..813
x=381, y=1786..1789
y=451, x=498..501
x=537, y=1487..1495
x=500, y=1040..1058
x=483, y=1159..1166
x=336, y=183..195
y=39, x=480..499
x=381, y=341..357
y=585, x=511..513
x=602, y=487..491
y=491, x=587..602
y=645, x=499..501
y=1546, x=416..431
x=347, y=406..431
x=581, y=1772..1795
x=439, y=1558..1567
x=429, y=560..573
y=727, x=513..538
x=355, y=965..975
x=366, y=700..711
x=491, y=540..555
x=418, y=1243..1256
x=409, y=1517..1527
x=537, y=1825..1847
y=1089, x=454..460
y=346, x=388..390
x=580, y=352..365
y=1540, x=584..601
y=1491, x=506..519
y=1875, x=526..548
y=1155, x=357..381
x=443, y=1874..1875
x=359, y=1275..1277
x=547, y=2000..2003
y=525, x=461..463
y=298, x=520..584
x=417, y=1648..1658
y=311, x=395..397
y=726, x=340..343
y=594, x=609..613
y=538, x=355..376
x=597, y=1573..1577
y=1560, x=576..600
x=601, y=839..855
x=527, y=1898..1914
y=1546, x=490..492
x=487, y=681..704
y=535, x=408..429
y=1107, x=410..426
x=484, y=1845..1851
x=482, y=1022..1042
y=1789, x=381..409
y=670, x=601..611
x=378, y=142..148
x=355, y=583..598
y=445, x=393..401
x=439, y=1336..1339
x=485, y=541..555
x=569, y=55..70
y=307, x=395..397
x=419, y=71..83
x=526, y=1938..1944
x=544, y=1337..1346
x=397, y=307..311
x=423, y=1726..1750
x=410, y=1115..1127
y=1172, x=415..424
x=443, y=1821..1837
x=582, y=1404..1406
x=401, y=422..445
x=538, y=1294..1320
x=505, y=419..432
x=470, y=1503..1512
x=458, y=672..674
x=406, y=816..826
x=548, y=1860..1875
y=1191, x=474..485
x=517, y=264..275
y=1495, x=528..537
y=1787, x=427..431
y=1640, x=486..494
y=205, x=418..437
x=398, y=1393..1398
x=413, y=651..677
x=342, y=952..979
x=440, y=1476..1502
y=1663, x=406..426
x=397, y=1657..1661
y=1065, x=450..455
x=352, y=1668..1680
y=757, x=400..425
y=848, x=549..571
y=1389, x=451..458
y=722, x=543..547
x=397, y=2024..2028
x=573, y=1457..1460
y=117, x=383..402
y=884, x=339..341
x=492, y=1109..1121
x=593, y=928..944
x=428, y=73..91
x=347, y=1416..1419
x=384, y=1391..1401
y=269, x=379..389
x=369, y=997..1004
x=563, y=1742..1744
x=375, y=594..617
x=572, y=196..207
x=474, y=210..213
y=1148, x=410..426
x=386, y=1202..1215
y=1416, x=342..347
y=1358, x=387..406
x=555, y=1653..1660
x=337, y=544..561
x=490, y=1934..1941
x=369, y=1908..1920
y=123, x=424..447
x=578, y=646..666
y=1327, x=354..377
y=1265, x=454..459
x=389, y=1999..2001
x=427, y=1933..1944
x=384, y=1285..1295
x=582, y=1680..1694
y=1028, x=587..590
x=364, y=141..148
x=396, y=1410..1423
x=433, y=1062..1080
y=1661, x=397..402
x=542, y=406..407
x=574, y=1783..1786
x=558, y=1339..1343
x=449, y=255..258
x=500, y=1886..1895
x=416, y=1670..1682
x=390, y=162..167
y=1209, x=582..603
x=373, y=1496..1509
y=1842, x=564..576
x=490, y=1451..1476
x=395, y=161..167
x=504, y=848..861
x=394, y=1590..1593
x=579, y=414..434
y=1463, x=564..580
x=446, y=161..164
x=434, y=1285..1295
x=576, y=1827..1842
x=454, y=1365..1368
x=411, y=1692..1705
x=393, y=1716..1730
y=2004, x=382..404
x=373, y=872..879
y=174, x=500..504
x=417, y=297..324
y=2054, x=506..513
x=374, y=1032..1036
y=318, x=388..407
x=607, y=374..387
x=454, y=776..782
y=571, x=393..396
x=515, y=1304..1328
y=1368, x=433..454
y=1746, x=486..496
x=412, y=1032..1041
x=350, y=1345..1353
x=410, y=1224..1236
x=380, y=1932..1944
x=486, y=1360..1371
x=393, y=1071..1084
x=608, y=117..136
x=360, y=1035..1037
y=884, x=500..503
x=376, y=784..795
x=347, y=1392..1402
x=613, y=1704..1709
x=499, y=622..645
x=548, y=139..151
x=397, y=483..506
x=454, y=98..105
x=422, y=1046..1058
y=1194, x=401..418
x=495, y=180..204
x=418, y=196..205
x=390, y=346..353
y=755, x=459..464
y=1268, x=585..598
x=399, y=985..997
y=213, x=474..476
y=1548, x=381..399
x=563, y=560..582
x=481, y=1279..1283
y=1423, x=373..396
x=487, y=1591..1592
y=642, x=338..343
x=383, y=740..765
x=611, y=660..670
x=477, y=1598..1626
y=574, x=403..417
y=1802, x=451..462
x=388, y=661..665
x=415, y=1267..1278
x=564, y=1828..1842
y=1339, x=436..439
x=381, y=740..765
x=492, y=661..672
y=206, x=538..558
x=354, y=1305..1327
y=910, x=479..495
y=2028, x=477..486
y=590, x=574..581
y=487, x=509..512
y=1686, x=558..570
y=1034, x=465..473
x=466, y=1838..1855
x=592, y=806..812
x=517, y=1636..1640
x=377, y=277..293
x=459, y=1707..1717
y=560, x=517..544
x=528, y=1486..1495
x=593, y=902..912
y=1542, x=459..486
x=431, y=1541..1546
x=467, y=394..407
y=1328, x=503..515
x=549, y=1409..1427
y=465, x=558..566
y=1871, x=381..383
y=707, x=341..343
y=1049, x=351..353
y=1944, x=526..549
x=392, y=1518..1527
y=1248, x=449..461
x=455, y=1622..1624
x=613, y=1060..1071
x=458, y=1968..1979
y=1068, x=335..359
x=503, y=873..884
x=537, y=1968..1976
x=396, y=1590..1593
y=1767, x=398..404
x=550, y=1370..1377
y=1039, x=465..473
x=519, y=1605..1628
x=374, y=1588..1591
y=1769, x=398..404
y=426, x=486..498
x=549, y=308..319
x=482, y=1504..1512
x=480, y=374..387
x=462, y=1413..1416
x=506, y=1920..1925
y=994, x=404..407
x=357, y=103..112
y=595, x=446..467
x=439, y=1760..1765
x=416, y=1541..1546
x=389, y=1543..1545
x=596, y=1019..1034
x=455, y=1268..1273
x=385, y=217..231
y=1647, x=587..606
y=2054, x=533..544
x=577, y=526..542
y=912, x=428..430
x=581, y=202..204
x=391, y=690..714
x=552, y=1923..1925
y=477, x=526..552
x=422, y=1873..1875
x=365, y=997..1004
y=204, x=579..581
y=1624, x=453..455
y=319, x=554..556
x=356, y=1411..1425
x=516, y=813..829
x=359, y=5..12
x=426, y=1959..1962
x=390, y=50..65
x=392, y=837..847
x=591, y=128..132
x=477, y=398..404
x=392, y=1497..1509
x=587, y=901..912
x=513, y=583..585
x=380, y=1435..1446
y=1680, x=352..369
x=370, y=1953..1966
x=534, y=1212..1228
x=419, y=1782..1795
x=379, y=242..269
y=830, x=372..394
y=1182, x=568..584
y=1111, x=508..511
x=595, y=1396..1409
x=552, y=456..477
y=946, x=404..428
y=1289, x=545..560
x=542, y=881..896
x=494, y=935..948
x=419, y=1284..1295
x=417, y=984..997
x=465, y=1034..1039
x=404, y=1155..1164
y=164, x=444..446
x=552, y=6..16
x=417, y=561..574
y=397, x=350..354
x=571, y=1336..1346
x=524, y=2023..2027
y=1941, x=490..500
x=603, y=621..634
x=452, y=561..573
x=344, y=187..191
x=438, y=550..557
x=389, y=2012..2022
y=1628, x=519..540
y=901, x=401..415
x=428, y=903..912
y=634, x=548..562
x=420, y=1974..1987
x=529, y=309..321
y=1876, x=405..410
y=1134, x=497..517
x=509, y=1547..1561
x=451, y=1386..1389
x=403, y=1825..1834
x=439, y=1781..1795
y=963, x=448..455
x=457, y=647..656
y=1027, x=507..529
y=677, x=446..466
y=1255, x=370..374
y=151, x=487..548
x=378, y=736..754
x=404, y=982..994
x=538, y=430..436
x=589, y=757..762
y=789, x=528..546
y=1979, x=453..458
x=554, y=559..579
y=38, x=571..574
x=404, y=418..441
y=387, x=480..607
x=346, y=2032..2041
x=556, y=246..249
x=485, y=1779..1785
x=389, y=1846..1858
x=442, y=476..494
x=416, y=923..926
y=312, x=592..594
y=1764, x=504..513
x=537, y=814..829
y=1119, x=575..577
x=404, y=1767..1769
x=453, y=749..762
x=481, y=1016..1018
y=1986, x=368..387
x=572, y=1984..1989
x=436, y=1336..1339
x=536, y=1999..2003
y=1166, x=555..565
x=364, y=543..561
y=457, x=368..387
y=1346, x=544..571
y=1156, x=430..444
x=454, y=1017..1018
y=904, x=486..489
x=398, y=1824..1829
y=1085, x=564..578
x=431, y=1760..1765
y=1314, x=332..346
x=468, y=299..303
x=410, y=1049..1061
x=414, y=1607..1616
x=402, y=1610..1613
x=591, y=649..651
x=378, y=1816..1818
x=500, y=1933..1941
x=402, y=1068..1076
x=552, y=1692..1694
x=449, y=644..653
x=533, y=263..275
x=372, y=823..830
y=109, x=510..534
x=490, y=1521..1546
x=454, y=1074..1089
y=785, x=419..464
x=504, y=170..174
y=1038, x=539..544
y=1640, x=408..425
x=378, y=1973..1983
y=333, x=472..496
x=511, y=1633..1652
y=1597, x=527..533
x=477, y=2024..2028
y=1914, x=527..555
y=303, x=465..468
x=352, y=1435..1448
y=401, x=395..408
x=382, y=1242..1261
x=566, y=443..465
x=474, y=1778..1785
x=443, y=706..719
y=790, x=478..504
x=498, y=441..451
y=403, x=420..439
y=804, x=513..529
x=404, y=1113..1124
x=368, y=453..457
y=1215, x=386..410
y=717, x=488..506
x=500, y=180..204
x=406, y=1189..1191
x=502, y=1360..1371
x=568, y=926..936
y=1944, x=380..402
x=449, y=1246..1248
x=612, y=1930..1956
y=299, x=465..468
x=491, y=1384..1393
x=381, y=1863..1871
x=511, y=49..62
y=407, x=542..558
x=441, y=729..733
y=1124, x=401..404
x=430, y=902..912
x=490, y=987..996
x=508, y=1205..1229
x=351, y=1123..1149
x=380, y=1285..1295
y=1311, x=475..487
x=613, y=16..29
y=1920, x=369..389
x=575, y=986..991
x=544, y=1512..1530
y=1590, x=394..396
y=597, x=365..369
x=398, y=1767..1769
x=459, y=67..88
x=402, y=1155..1164
y=399, x=367..387
x=558, y=1672..1686
x=584, y=1179..1182
x=410, y=1157..1171
y=1336, x=469..485
x=343, y=639..642
x=469, y=987..996
x=480, y=27..39
x=369, y=1315..1324
x=362, y=291..297
y=258, x=449..451
y=471, x=498..501
x=436, y=238..261
y=968, x=415..417
x=584, y=1798..1810
x=381, y=1136..1155
x=481, y=681..704
x=349, y=673..675
x=546, y=774..789
x=436, y=1578..1603
x=387, y=454..457
x=454, y=158..174
x=518, y=1533..1553
x=593, y=1926..1941
y=1591, x=372..374
y=1834, x=509..511
x=366, y=1643..1646
x=362, y=1487..1498
x=535, y=179..182
x=460, y=1074..1089
x=342, y=1416..1419
x=555, y=868..882
y=1085, x=510..536
x=458, y=361..381
y=1250, x=535..545
x=563, y=1213..1223
y=1570, x=400..402
x=589, y=531..534
y=202, x=579..581
x=392, y=1477..1487
y=1398, x=355..376
x=386, y=1714..1722
y=1672, x=502..530
y=881, x=450..454
x=382, y=1033..1036
y=1634, x=434..443
x=338, y=640..642
y=1845, x=481..484
x=341, y=882..884
x=476, y=684..696
x=514, y=1921..1929
x=393, y=1268..1278
x=455, y=537..549
x=361, y=103..112
y=1419, x=342..347
y=1371, x=486..502
x=511, y=958..976
x=467, y=584..595
x=393, y=421..445
x=420, y=1133..1143
y=310, x=346..369
x=544, y=1015..1038
x=397, y=1369..1381
x=364, y=941..954
x=506, y=1700..1706
y=829, x=516..537
y=1834, x=403..424
x=609, y=649..651
x=585, y=985..991
y=762, x=453..473
y=61, x=409..434
x=537, y=307..319
x=568, y=1924..1925
x=481, y=1938..1956
x=419, y=1046..1058
x=450, y=881..884
x=472, y=330..333
x=411, y=1921..1948
y=477, x=583..590
x=336, y=1274..1277
x=529, y=795..804
y=182, x=535..539
x=332, y=1301..1314
y=1813, x=422..428
x=510, y=1590..1592
x=332, y=2051..2064
x=425, y=637..648
y=1451, x=415..417
x=406, y=1346..1358
x=466, y=710..734
x=503, y=1726..1730
y=1744, x=560..563
y=230, x=438..446
x=414, y=1828..1830
y=930, x=373..505
y=801, x=559..570
x=351, y=951..979
x=394, y=822..830
y=1018, x=454..481
x=359, y=595..617
x=598, y=1262..1268
x=408, y=1628..1640
y=255, x=449..451
x=511, y=583..585
x=520, y=1636..1640
y=1100, x=469..496
x=544, y=534..560
x=396, y=557..571
x=536, y=1067..1085
x=585, y=1263..1268
x=369, y=286..310
y=936, x=552..568
y=275, x=517..533
x=364, y=184..195
x=535, y=1736..1754
x=358, y=2051..2064
x=609, y=570..594
x=574, y=1397..1409
x=552, y=925..936
y=1626, x=459..477
y=1393, x=393..398
x=468, y=142..169
x=397, y=1475..1482
x=529, y=63..86
x=497, y=1953..1968
x=362, y=68..83
y=1127, x=393..410
x=422, y=1803..1813
x=408, y=230..244
x=464, y=773..785
y=2001, x=389..398
y=416, x=513..534
x=373, y=1866..1879
x=409, y=1478..1487
y=20, x=488..510
x=574, y=568..590
y=812, x=575..592
x=596, y=424..431
x=395, y=307..311
x=592, y=305..312
y=1335, x=384..404
x=587, y=1646..1647
x=344, y=1123..1149
x=585, y=1853..1863
x=596, y=698..717
x=355, y=1384..1398
x=488, y=11..20
y=231, x=385..389
x=498, y=422..426
y=887, x=333..349
x=569, y=869..882
y=866, x=384..495
y=86, x=353..371
x=515, y=871..897
y=244, x=408..410
x=497, y=1107..1134
x=368, y=1976..1986
x=434, y=1627..1634
y=1577, x=597..605
x=451, y=255..258
x=532, y=1826..1847
y=1941, x=590..593
x=513, y=715..727
x=408, y=1739..1749
x=605, y=1950..1952
y=1094, x=373..395
x=457, y=842..844
y=555, x=485..491
x=575, y=594..612
x=574, y=14..38
x=571, y=1457..1460
x=396, y=923..926
x=568, y=1108..1125
x=501, y=441..451
y=473, x=539..546
x=419, y=1368..1381
y=1783, x=572..574
x=410, y=1136..1148
x=569, y=724..752
y=948, x=494..503
x=488, y=1954..1968
x=533, y=2032..2054
y=887, x=495..511
y=381, x=435..458
x=477, y=816..826
y=1568, x=448..455
x=545, y=1263..1289
y=1856, x=607..613
x=442, y=12..16
x=590, y=568..591
y=490, x=509..512
x=394, y=1158..1171
x=576, y=1555..1560
x=358, y=1845..1857
y=1256, x=415..418
x=542, y=1513..1530
y=1606, x=358..382
x=355, y=526..538
x=557, y=1762..1768
x=350, y=1472..1478
y=1868, x=429..453
x=453, y=1850..1868
x=519, y=234..255
y=1140, x=537..558
x=439, y=1657..1670
x=349, y=868..887
y=799, x=457..460
x=345, y=1588..1592
x=548, y=176..186
x=486, y=1739..1746
y=947, x=521..524
x=444, y=2008..2034
y=126, x=408..411
x=417, y=1805..1817
x=587, y=488..491
x=528, y=1540..1544
y=669, x=586..598
x=357, y=1136..1155
x=353, y=63..86
x=591, y=1798..1810
x=389, y=1887..1899
y=289, x=464..489
x=507, y=1004..1027
x=430, y=1133..1156
y=1857, x=358..384
x=556, y=306..319
y=679, x=334..358
x=506, y=712..717
x=420, y=1093..1104
x=527, y=1282..1289
y=1851, x=481..484
x=532, y=1922..1929
y=1402, x=339..347
x=415, y=1156..1172
y=1925, x=552..568
x=557, y=986..988
y=124, x=557..560
y=531, x=587..589
y=273, x=370..375
y=1567, x=427..439
x=454, y=881..884
x=510, y=95..109
y=293, x=377..382
x=547, y=711..722
y=996, x=469..490
x=393, y=558..571
y=674, x=458..460
x=395, y=1092..1094
y=1917, x=380..383
y=1261, x=363..382
x=434, y=1656..1670
y=1747, x=548..574
y=754, x=372..378
x=602, y=46..72
x=605, y=1574..1577
y=1121, x=488..492
y=1673, x=596..602
y=1952, x=601..605
x=580, y=2031..2047
x=363, y=1054..1078
x=464, y=277..289
y=1858, x=389..416
x=501, y=462..471
y=1509, x=373..392
x=430, y=1225..1236
x=540, y=1669..1674
x=461, y=997..999
x=380, y=1906..1917
x=450, y=794..806
x=358, y=1582..1606
y=634, x=600..603
y=1530, x=542..544
x=420, y=1222..1232
x=381, y=1714..1722
y=675, x=341..349
x=491, y=1601..1612
x=527, y=871..897
x=565, y=1339..1343
x=590, y=466..477
x=339, y=328..355
x=612, y=118..136
y=2064, x=332..358
x=402, y=34..46
x=359, y=68..83
y=1460, x=571..573
x=388, y=108..112
y=973, x=520..522
y=148, x=364..378
y=2041, x=346..401
x=558, y=1133..1140
x=336, y=1473..1478
x=474, y=1177..1191
y=1042, x=459..482
x=576, y=634..639
y=1795, x=566..581
x=496, y=1738..1746
y=112, x=357..361
y=714, x=391..409
y=431, x=342..347
y=806, x=450..466
y=1273, x=400..406
y=609, x=365..369
y=410, x=444..456
x=400, y=1884..1896
y=591, x=588..590
x=533, y=1578..1597
y=956, x=432..439
x=405, y=1869..1876
y=321, x=507..529
y=1989, x=544..572
y=882, x=339..341
x=402, y=1515..1523
x=389, y=1953..1966
x=410, y=1095..1107
x=462, y=1776..1802
x=584, y=1404..1406
y=711, x=366..382
x=524, y=1540..1544
y=997, x=399..417
x=495, y=899..910
x=488, y=1109..1121
x=403, y=709..711
y=48, x=536..542
x=431, y=1932..1944
x=609, y=46..72
x=385, y=1584..1598
y=549, x=451..455
x=434, y=550..557
y=1929, x=514..532
x=545, y=598..609
x=465, y=1707..1717
y=734, x=466..472
x=539, y=1735..1754
x=483, y=1887..1895
x=607, y=1829..1856
x=575, y=1484..1490
x=526, y=1408..1427
x=386, y=1543..1545
x=500, y=71..84
x=565, y=1878..1881
x=565, y=1163..1166
x=544, y=1985..1989
x=417, y=955..968
x=478, y=767..790
y=1467, x=369..392
x=588, y=219..230
y=609, x=545..568
x=473, y=748..762
x=444, y=1134..1156
x=398, y=1999..2001
x=404, y=1689..1698
x=544, y=882..896
x=594, y=2030..2047
y=1722, x=381..386
y=272, x=524..526
x=359, y=1055..1068
x=547, y=1902..1908
x=425, y=1440..1458
x=459, y=1021..1042
x=513, y=794..804
y=1278, x=393..415
x=538, y=1691..1694
y=169, x=537..562
y=1228, x=534..542
x=571, y=831..848
x=417, y=1133..1143"""