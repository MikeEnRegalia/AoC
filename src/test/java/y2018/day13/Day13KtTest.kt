package y2018.day13

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class Day13KtTest {

    @Test
    fun test() {

        val input =
            """
        /--------------------------------------------------------\  /---------\                                              /------------------\     
        |                                        /---------------+--+--\      |                                              |                  |     
        |                                        |   /-----------+--+--+------+---------------------------------------\      |                  |     
        |               /------------------------+---+-----------+--+--+------+-\                                     |      |                  |     
        |       /-------+------------------------+---+-----------+--+--+------+-+---------------------------\         |      |                  |     
        |       |       |                        |   |           |  |  |    /-+-+-------------\             |         |      |                  |     
        |       |       |      /-----------------+---+-----------+--+--+----+-+-+-------------+-------------+---------+------+----\             |     
        |       |       | /----+-----------------+---+-----------+--+--+----+-+-+-------------+-------------+---------+------+\   |             |     
        |     /-+-------+-+----+-----------------+---+-----------+--+--+----+-+-+-------------+------------\| /-------+------++---+----\        |     
/-------+-----+-+-------+>+----+--------\        |   |           |  |  |    | | |             |            || |       |      ||   |    |        |     
|       |     | |   /---+-+--\ |        |        |   |           |  \--+----+-/ |             |            || |       |      |^   |    |        |     
|       |     | |   |   | |  | |        |    /---+---+-----------+-----+----+---+-------------+-\          || |  /----+------++---+----+-\      |     
|       \-----+-+---+---+-+--+-+--------+----+---+---+>----------/     |    |  /+-------------+-+----------++-+--+----+------++\  |    | |      |     
|             | |/--+---+-+--+-+--------+----+---+---+-----------------+----+--++-------------+-+----------++-+--+----+--\   |||  |    | |      |     
|   /---------+-++--+---+-+--+-+\    /--+----+---+---+-----------------+----+\ ||             | |          || |  |    |  |   |||  |    | |      |     
|   |         | ||/-+---+-+--+-++----+--+----+---+---+-----\           |   /++-++-------------+-+----------++-+--+----+\/+---+++--+----+-+\     |     
|   |         | ||| |  /+-+--+-++----+--+----+---+---+-\   |           |   ||| ||             | |          || |  |    ||||   |||  |    | ||     |     
|   |         | ||| |  || |  | ||    |  |    |   |   | |   |   /-------+---+++-++-------------+-+----------++-+--+----++++---+++--+-\  | ||     |     
|   |         | ||| |  || |  | \+----+--+----+---+---+-+---+---+-------+---+++-++-------------+-+----------++-+--+----++++---+++--/ |  | ||     |     
|   |         | ||| |  || |  |  |    |  |    |   |   | |   |   |       |   ||| ||  /----------+-+----------++-+\ |    ||||   |||    |  | ||     |     
|   |         | ||| |  || |  |  |    |  |    | /-+---+-+---+---+-------+---+++-++--+---------\| |          || || |    ||||   |||    |  | ||     |     
|   |         | ||| |  || |  |  |    |  |    | | |   | | /-+---+-------+---+++-++--+---------++-+\         || || |    ||||   |||    |  | ||     |     
|   |         | |\+-+--++-+--+--+----+--+----+-+-+---+-+-+-+---+-------+---+++-++--+---------++-++---------++-++-+----+++/   |||    |  | ||     |     
|   |         | | | |  || |  |  |    |/-+----+-+-+---+-+-+-+---+-------+---+++-++--+---------++-++---------++-++-+----+++----+++----+-\| ||     |     
|   |         | | | |  || |  | /+----++-+----+-+-+---+-+-+-+---+-------+---+++-++--+---------++-++----\    || || |    |||    |||   /+-++-++----\|     
|   |         | | | |  || |  | ||    || |    | | |   | | | |   |       |   ||| ||  |         || ||    |    || || |    |||/---+++---++-++-++----++--\  
\--<+---------+-+-+-+--++-+--+-++----++-/    | |/+---+-+-+-+---+-------+---+++-++--+-----\   || ||    |    || || |    ||||   |||   || || ||    ||  |  
 /--+---------+-+-+-+--++-+--+-++----++------+-+++---+\| | |   |       |   ||| ||  |     |   || ||    | /--++-++-+----++++---+++---++-++-++-\  ||  |  
 |  |         | | | |  \+-+--+-++----++------+-+++---++/ | |   |       |/--+++-++--+-----+---++-++----+-+-\|| || |    ||||   |||   || || || |  ||  |  
 |  |         | | | |  /+-+--+-++----++------+-+++---++--+-+\  |       ||  ||| ||  |     |   || ||    | | ||| || |    ||||   |||   || || || |  ||  |  
 |  |         | | | |  || |  | ||    ||      | |||   ||  ^ ||  |    /--++--+++-++--+--\  |   || ||    | | ||| || |    ||||   |||   || || || |  ||  |  
 | /+---------+-+-+-+\ || |  | ||    ||      | |||   ||  | ||  |    |  ||  |||/++--+--+--+---++-++----+-+-+++-++-+---<++++---+++---++\|| || |  ||  |  
 | ||         | | | || || |  | ||    ||   /--+-+++---++--+-++--+----+--++--++++++--+--+-\|   || ||    | | ||| \+-+----++++---+++---++++/ || |  ||  |  
 | ^|         | | | || || |  | ||    ||   |  | |||   ||  | ||  |    |  ||  ||||||  |  | ||   || ||    | | |||  | |    ||||   |||   ||||  || |  ||  |  
 | ||         | | | || || |  | ||    ||   |  | ||\---++--+-++--+----+--/|  ||||||  |  | ||   || ||    | | |||  | |    ||||   |||   ||||  || |  ||  |  
 | ||         | | | || || |  | ||    \+---+--+-++----++--+-++--+----+---+--++/|||  |  | ||   || ||    | | |||  | |    ||||   |||   ||||  || |  ||  |  
 | ||     /---+-+-+-++-++-+--+-++-----+---+--+-++----++--+-++--+----+---+--++-+++--+--+-++---++\||    | | |||  | |    ||||   |||   |||| /++-+--++-\|  
 | ||     |   | | | || ||/+--+-++-----+---+--+-++----++--+-++--+----+--<+--++-+++--+--+-++---+++++----+\| |||  | |    ||||   |||   |||| ||| |  || ||  
 | ||     |   | | | || ||||  | ||     |   |  | ||    ||  | ||  |    |   |  || |||  |  | ||   |||||    ||| |||  | |    |||| /-+++---++++-+++-+--++-++\ 
 | ||     |   | | | || ||||  | ||     |   |  | ||    ||  | ||  |    |   |/-++-+++--+--+-++---+++++----+++-+++--+-+----++++-+-+++---++++-+++-+\ || ||| 
 | ||     |   | | | || ||||  | ||     | /-+--+-++----++--+-++--+----+---++-++-+++--+--+-++---+++++----+++-+++-\| |    ||\+-+-+++---++++-++/ || || ||| 
 | ||     |   | | | || ||||  | ||     | | |  | ||    || /+-++--+----+---++-++-+++--+--+-++---+++++----+++-+++-++-+----++-+\| |||   \+++-++--++-/| ||| 
 | || /---+---+-+-+-++-++++--+-++-----+-+-+--+-++----++-++-++--+----+---++-++-+++--+--+-++---+++++---\||| ||| || |    || ||| |||    ||| ||  ||  | ||| 
 | || |   |   | | | || ||||  | ||     | | |  | |\----++-++-++--+----+---++-++-+++--+--+-+/   |||||   |||| ||| || |    || ||| |||    ||| ||  ||  | ||| 
/+-++-+---+---+-+-+-++-++++--+-++-----+-+-+--+\|   /-++-++-++--+----+---++-++-+++--+--+-+----+++++-\ |||| ||| || |    || ||| |||    ||| ||  ||  | ||| 
|| || |   |   | | | || ||||  | ||     | | |  |||   | || || ||  |    |   || || \++--+--+-+----+++++-+-++++-+++-++-+----++-+++-+++----+/| ||  ||  | ||| 
|| |\-+---+---+-+-+-++-++++--+-+/     | | |  ||\---+-++-++-++--+----+---++-++--++--+--+-+----/|||| | |||| ||| || |    || ||| |||/---+-+-++--++\ | ||| 
|| |  |   |   | | | || ||||  | |  /---+-+-+--++----+-++-++-++--+----+---++-++--++--+--+\|     |||| | |||| ||| || |    || ||| ||||   | | ||  ||| | ||| 
|| |  |   |   | | | || ||||  | |  |  /+-+-+--++----+-++-++-++--+--\ |   || ||  ||  |  |||     |||| | |||| |||/++-+----++-+++\||||   | | ||  ||| | ||| 
|| |  |   |   | | | || ||||  | |  |  || | |  ||    | || || ||  |  | |   || ||  ||  |  |||     |||| | |||| |||||| |    || ||||||||   | | ||  ||| | ||| 
|| |  | /-+---+-+-+-++-++++--+-+--+--++-+-+--++----+-++-++-++--+--+-+---++-++--++--+--+++-----++++-+-++++\|||||| |    || ||||||||   | | ||  ||| | ||| 
|| |  | | |   | | | || ||||  | |  |  || | |  ||    | || || ||  |  | |   || ||  ||  |  |||     |||| |/+++++++++++-+--\ || ||||||||   | | ||  ||| | ^|| 
|| |  | | |   | | | || |||\--+-+--+--++-+-+--++----+-++-++-++--+--+-+---++-++--++--+--+++-----++++-+++++++++++++-+--+-++-+++++/||   | | ||  ||| | ||| 
|| |  | | |   | | | || |||   | |  |  || | |  ||    | || || ||  |  | |   || ||  ||  |  |||     |||| ||||||||||||| |  | || ||||\-++---+-+-++--+++-/ ||| 
|| |  | | |   | | | || |||   | |  |  || | |  ||    | || || ||  |  | |   || ||  ||  |  |||     |||| ||||||||||||| |  | || ||||  ||   | | ||  |||   ||| 
|| |  | | |   | | | || |||/--+-+--+--++\| |  ||    | || || ||  |  | |   || ||  ||  |  |||     |||| ||||||||||||| |  | || ||||  ||   | | ||  |||   ||| 
|| |  \-+-+---+-+-+-++-++++--+-+--+--++++-+--++----+-++-++-++--+--+-+---++-++--++--+--+++-----++++-++/|||||||||| |  | || ||||  ||   | | ||  |||   ||| 
|| |    | |   | | | || ||||  | |  |  |||| |  ||    | || ||/++--+--+-+---++-++--++--+\ |||     |||| || |||||||||| |  | || ||||  ||   | | ||  |||   ||| 
|| |    | \---+-+-+-++-++++--+-+--+--++++-+--++----+-++-+++++--+--+-+---++-++--++--++-+++-----+/|| || |||||||||| |  | || ||||  ||   | | ||  |||   ||| 
|| |    |     | \-+-++-++++--+-+--+--++++-+--++----+-++-+++++--+--+-+---++-++--++--++-+++-----+-++-++-++++++/||| |  | || ||||  ||   | | ||  |||   ||| 
|| |    |     |   | || ||||  | \--+--++++-+--++----+-++-+++++--+--+-+---++-++--++--++-+++-----+-++-++-/||||| ||| \--+-++-++++--++---+-+-+/  |||   ||| 
|| |    | /---+---+-++-++++\ |   /+--++++-+--++-->-+-++-+++++--+--+-+---++-++--++--++-+++-----+-++-++--+++++-+++----+-++\||||  ||   | | |   |||   ||| 
|| | /--+-+---+---+-++-+++++-+---++--++++-+--++----+-++-+++++--+--+-+---++-++--++--++-+++-----+-++-++--+++++-+++\   | |||||||  ||   | | |   |||   ||| 
|| | |  | |   |   \-++-+++++-+---++--++++-+--++----+-++-+++/|  | /+-+---++-++--++--++\|||     | || ||  ||||| ||||   | |||||||  ||   | | |   |||   ||| 
|| | |  | |   |  /--++-+++++-+---++--++++-+--++----+-++-+++-+--+-++-+---++-++--++--++++++-----+-++-++--+++++-++++\  | |||||||  ||   | | |   |||   ||| 
|| | |  | |   |  |  || ||\++-+---++--++++-+--++----+-++-+++-+--+-++-+---++-++--++--++++++-----+-++-++--/|||| |||||  | |||||||  ||   | | |   |||   ||| 
|| | |  | |   |  |  || || || |   |\--++++-+--++----+-++-+++-+--+-++-+---++-++--++--++++/|     | || ||   |||| |||||  | |||||||  ||   | | |   |||   ||| 
||/+-+--+-+\  |  |  || || || |   |   |||| |  ||  /-+-++-+++-+--+-++-+---++-++--++\ |||| |  /--+-++-++---++++-+++++--+-+++++++--++---+-+-+---+++--\||| 
\+++-+--+-++--+--+--++-++-++-+---+---++++-+--+/  | | || ||| |  | || |/--++-++--+++-++++-+--+--+-++-++---++++-+++++--+-+++++++--++\  | | |   |||  |||| 
 ||| |  | ||  |  |  || || || |   |   |||| |  |   | | ||/+++-+--+-++-++--++-++--+++-++++-+--+--+-++-++---++++-+++++--+-+++++++--+++--+-+-+--\|||  |||| 
 ||| |  | ||  |  |  || || || |   |   |||| |  |   | | ||||\+-+--+-++-++--++-++--+++-++++-+--+--+-+/ ||   |||| |||||  | |||||||  |||  | | |  ||||  |||| 
 ||| |  | ||  |  |  || || || |   |   |||| |  |   | | |||| | |  | || ||  || ||  ||| |||| |  |  | |  ||   |||| |||||  | |||||||  |||  | | |  ||||  |||| 
 ||| |/-+-++--+--+--++-++-++-+---+---++++-+--+---+-+-++++-+-+--+-++\||  || ||  ||| |||| |  |  | |  ||   |||| |||||  | |||||||  |||  | | |  ||||  |||| 
 ||| || | ||  |  |  || || || |/--+---++++-+--+---+-+-++++-+-+--+-+++++--++-++--+++-++++\|  |  | |  ||   |||| |||||  |/+++++++--+++--+\| |  ||||  |||| 
 ||| || | ||  |  |  || || |v ||  |   |||| |  |   | | |||| | |  | |||||  || ||  ||| ||||||  |  | |  ||   \+++-+++++--+++++++++--+++--+++-+--+/||  |||| 
 ||| || | ||  |  |  \+-++-++-/|  \---++++-+--+---+-+-++++-+-+--+-+++++--++-++--+++-++++++--+--+-+--++----+++-+++++--++++/||||  |||  ||| |  | ||  |||| 
 ||| \+-+-++--+--+---+-++-++--+------++++-+--+---+-+-++++-+-+--+-+++++--++-++--+++-++++++--+--+-+--++----+++-+++/|  |||| ||||  |||  ||| |  | ||  |||| 
 |||  | | ||  |  |   | |\-++--+------++++-+--+---+-+-++++-+-+--+-+++++--++-++--+/| ||||||  |  | |  ||    ||| ||| |  |||| ||||  |||  ||| |  | ||  |||| 
 |||  | | ||  |  |   | |  ||  | /----++++\|  |   | | |||| | |  | |||||  || \+--+-+-++++++--+--+-+--++----+++-+++-+--+++/ ||||  |||  ||| |  | ||  |||| 
 |||  | | ||  |  |   | |  ||  | |    ||||||  |   | | |||| | |  | |||||  ||  |  | | ||||||  |  | |  ||    ||| ||| |  |||  ||||  |||  ||| |  | ||  |||| 
 |||  | | ||  |  |   | |  ||  | |    ||||||  |/--+-+-++++-+-+--+-+++++--++\ |  | | \+++++--+--+-+--++----+++-++/ |  |||  ||||  |||  ||| |  | ||  |||| 
 |||  | | ||  |  |   | |  ||  | |    ||||||  ||  | | |||| | |  | |||||  ||| |  | |  |||||  |  | |  ||    ||| ||  |  |||  ||||  |||  ||| |  | ||  |||| 
 |||/-+-+-++--+--+---+-+--++--+-+-\  ||||||  ||  | | |||\-+-+--+-+++++--+++-+--+-+--+++++--+--+-+--++----+++-++--+--+++--+/||  |||  ||| |  | ||  |||| 
 |||| | | ||  |  |   |/+--++--+-+-+--++++++--++--+-+\|||  | |  | |||||  ||| |  | |  |||||  |  | |  ||    ||| ||  |  |||  | ||  |||  ||| |  | ||  |||| 
 |||| | | ||  |  |   |||  ||  | | |  ||||||  ||  | |||||  | |  | |||||  ||| \--+-+--+++++--+--/ |  ||    ||| ||  |  |||  | ||  |||  ||| |  | ||  |||| 
 |||| | | ||  |  |   |||  ||  | | |  ||||||  ||  | |||^|  | |  | |||||  |||    | |  |||||  |    |  ||    ||| ||  |  |||  | ||  |||  ||| |  | ||  |||| 
 |||| | | ||  |  |   |||  \+--+-+-+--++/|||  ||  | |||||  | |  | |||||  |||    | |  |||||  |    |  ||    ||| ||  |  |||  | ||  |||  ||| |  | ||  |||| 
 ||||/+-+-++--+--+---+++---+--+-+-+--++-+++--++--+-+++++--+-+--+-+++++--+++----+-+\ |||||  |    |  ||    ||| ||  |  |||  | ||  |||  ||| |  | ||  |||| 
 |||||| | ||  |  |   ||| /-+--+-+-+--++\|||  ||  | |||||  | |  | |||||/-+++----+-++-+++++--+----+--++----+++-++--+-\|||  | ||  |||  ||| |  | ||  |||| 
 |||||| | ||  |  |/--+++-+-+--+-+-+--++++++--++--+-+++++--+-+--+-++++++-+++----+-++-+++++--+----+--++--\ ||| ||  | ||||  | ||  |||  ||| |  | ||  |||| 
 |||||| | ||  |  ||  ||| | |  | | |/-++++++--++--+-+++++--+-+--+-++++++-+++----+-++-+++++--+----+--++--+-+++-++--+-++++-\| ||  |||  ||| \--+-++--+/|| 
 \+++++-+-++--+--++--+++-+-+--+-+-++-++++++--++--+-+++/|  | |  | |||||| |||    \-++-+++++--+----+--++--+-+++-++--+-++++-++-++--/||  |||    | ||  | || 
  ||||| | ||  |  ||  ||| | |  | |/++-++++++--++--+\||| |  | |  | |||||| |||      || |||||  |    |  |\--+-+++-++--+-+/|| || ||   ||  |||    | ||  | || 
  ||||| | ||  |  ||  ||| | |  \-++++-++++++--++--+++++-+--+-+--+-++++++-+++------++-+++/|  |    |  |   | ||| ||  | | ||/++-++---++--+++----+-++\ | || 
  ||||\-+-++--+--++--+++-+-+----++++-++++++--++--+++++-+--+-+--+-++/||| |||      || ||| |  |    |  |   | ||| ||  | | ||||| ||   ||  |||    | ||| | || 
  ||||  | ||  |  ||  ||| | |    |||| |\++++--++--+++++-+--+-+--+-++-+++-+++------++-+++-+--+----+--+---+-+++-++--+-+-+++++-++---++--++/    | ||| | || 
  ||||  | \+--+--++--+++-+-/    \+++-+-++/|  ||  ||||| |  | |  | || ||| |||      || ||| |  |    |  |   | ||| ||  | | ||||| ||   ||  ||     | ||| | || 
  ||||  |  |  |  ||  ||| |       ||| | || |  ||  ||||| |  | |  | || ||| |||      || ||| |  |    |  |   | ||| ||  | | ||||| ||   ||  ||     | ||| | || 
  ||||  |  |  |  ||  ||| |       ||| \-++-+--++--+++++-+--+-+--+-+/ ||| |||      || ||| |  |    |  |   | ||| ||  | | \++++-++---++--+/     | ||| | || 
  ||||  |  |  |  ||  ||| |       |||   || |  ||  ||||| |  | |  | |  ||| |||      || ||| |  |    |  | /-+-+++-++-\| |  |||| ||   ||  |      | ||| | || 
  ||||  |  |  |  ||  ||| |       |||   || |  ||  ||||| |  | |/-+-+--+++-+++------++-+++-+--+----+--+-+-+-+++-++-++-+--++++-++---++--+-----\| ||| | || 
  ||||  |  |  |/-++--+++-+-------+++---++-+--++--+++++-+--+-++-+-+--+++-+++------++-+++\|  |    |  | | | ||| || || |  |||| ||   ||  |     || ||| | || 
  ||||  |  |  || ||  ||| |       |||   || | /++--+++++-+--+-++-+-+--+++-+++------++-+++++-\|    |  | | | ||| || || |  |||| ||   ||  |     || ||| | || 
  ||||  |  |  || ||  ||| |       |||   || | |||  \++++-+--+-++-+-+--+++-+++------/| ||||| ||    |  | | | ||| || v| |  |||| ||   ||  |     || ||| | || 
  ||||  |  |  || ||  ||| |       |||   || | |||   |||\-+--+-++-+-+--+++-+++-------+-+++++-++----+--+-+-+-+++-++-++-+--/||| ||   ||  |     || ||| | || 
  ||||  |  |  || ||  ||| |       \++---++-+-+++---/||  |  | || | |  ||| ||| /-----+-+++++-++----+--+-+\| ||| || || |   ||| ||   ||  |     || ||| | || 
  ||||  |  |  \+-++--+++-+--------++---++-+-+++----++--+--+-++-+-+--+++-+++-+-----+-+++++-++----+--+-+++-++/ || || |   ||| ||   ||  |     || ||| | || 
  ||||  |  |   | ||  |\+-+--------++---++-+-+++----+/  |  | || \-+--+++-+++-+-----+-+++++-++----+--+-+++-++--++-++-+---+++-++---++--/     || ||| | || 
  ||||  |  |   | ||  | | |        ||   || | |\+----+---+--+-++---+--+++-+++-+-----+-+++++-++----/  | ||| ||  || || |   ||| ||   ||        || ||| | || 
  ||||  |  |   | \+--+-+-+--------++---++-+-+-+----+---+--+-++---+--+++-+++-+-----+-+++++-++-------+-+++-++--++-+/ |   ||| ||   ||        || ||| | || 
  ||||  |  |   |  |  | | |        ||   |\-+-+-+----+---+--+-++---+--+++-+++-+-----+-+++++-++-------+-+++-++--+/ |  |   ||| ||   ||        || ||| | || 
  ||||  |  |   |  |  | | |        || /-+--+-+-+----+>--+--+-++---+--+++-+++-+-----+-+++++-++-------+-+++-++--+--+--+---+++-++---++----\   || ||| | || 
  ||||  |  |   |  |  | | |        || | |  | | |    |   |  | |\---+--+++-+++-+-----+-+++++-++-------+-+++-++--+--+--+---+++-++---++----+---/| ||| | || 
  ||||  |  |   \--+--+-+-+--------++-+-+--+-+-+----+---+--+-+----+--+++-+++-+-----+-+++/| ||       | ||| ||  |  |  |   ||| ||   ||  /-+----+-+++\| || 
  ||||  |  | /----+--+-+-+--------++-+-+-\| | |    |   |  | |    |  ||\-+++-+-----+-+++-+-++-------+-+++-++--+--+--/   ||| ||   ||  | |    | ||||| || 
  ||||  |  | |  /-+--+-+-+-----\  || | | ||/+-+----+---+--+-+----+--++--+++-+-----+-+++-+-++-------+\||| ||  \--+------+++-+/   ||  | |    | ||||| || 
  ||||  |  | |  | |  | | |     |  || | | |||| |  /-+---+--+-+----+--++--+++-+-----+-+++-+-++-------+++++-++-----+------+++-+----++--+-+----+\||||| || 
  |||\--+--+-+--+-+--+-+-+-----+--++-+-+-++++-+--+-+---+--+-+----+--++--+++-+-----/ ||| | ||       ||||| ||     |      ||| |    ||  | |    ||||||| || 
  |||   |  | |  | |  | | |     |  || | | |||| |  | |   |  | |    |  ||  ||| \-------+++-+-++-------+++/| ||     |      ||| |    ||  | |    ||||||| || 
  |||   |  | |  | |  | \-+-----+--++-+-+-++++-+--+-+---+--+-/    |  ||  ||| /-------+++-+-++--\    ||| | ||     |      ||| |    ||  | |    ||||||| || 
  |||   |  | |  | |  |   |     |  || | | |\++-+--+-+---+--+------+--++--+++-+-------+++-/ ||  |    ||| | ||     |      ||| |    ||  | |    ||||||| || 
  |||   |  | |  |/+--+---+-----+--++-+-+-+\|| |  | |   |  |      |  ||  ||| |       |||   ||  |    ||| | ||     |      ||\-+----++--+-+----+++++++-/| 
  |||   |  | |  |||  |   |     |  || | | |||| |  | |   |  |      |  ||  \++-+-------+++---++--+----+++-+-+/     |      \+--+----++--+-+----++++/||  | 
  ||\---+--+-+--+++--+---+-----+--/| | | |||| \--+-+---+--+------+--++---+/ |       |||   ||  |    ||| | |      |       |  |    ||  | |    |||| ||  | 
  ||    |  | |  |||  |   |     |   | | | ||||    | |   |/-+------+--++---+--+------\|||   ||  |    ||| | |      |       |  |    ||  | |    |||| ||  | 
  ||    |  | |  |||  |   \-----+---+-+-/ ||||    | |   || |      |  ||   |  |      ||||   ||  |    ||| | |      |       |  |    ||  | |    |||| ||  | 
  ||    |  | |  |||  |         |   | |   ||||    | |   \+-+------+--++---+--+------++++---++--+----+++-+-+------+-------+--+----++--+-+----/||| ||  | 
  ||    |  | |  |||  |         |   | |   ||||    | |    | |      |  \+---+--+------+++/   |\--+----+++-+-+------+-------+--+----++--+-+-----+++-+/  | 
  ||    |  | |  |||  |         |   | |   ||||    | |    |/+------+---+---+--+------+++----+---+----+++-+-+----\ |       |  |    ||  | |     ||| |   | 
  \+----+--/ |  \++--+---------/   | |   ||||    | |    |||      |   |   |  |      |||    |   |    ||| | |    | |       |  |    ||  \-+-----+++-/   | 
   |    |    |   ^|  |             | |   ||||    | |    |||      |   |   |  |      |||    |   |    ||| | |    | |       |  |    ||    |     |||     | 
   |    |    |   ||  |             | |   ||||    | |    |||      |   |   |  |      |||    |   |    ||| | |    | |       |  |    ||    |     |||     | 
   |    |    |   \+--+-------------+-+---+/|\----+-+----+++------+---+---+--+------+++----/   |    ||| | |    | |       |  |    ||    |     |||     | 
   |  /-+----+----+--+------\      | |   | |     \-+----+++------+---+---+--+------+++--------+----+++-+-+----+-+-------+--+----++----+-----/||     | 
   |  | |    |    |  |      |      | |   | |       |    |||      |   \---+--+------+++--------+----+++-+-+----+-+-------+--+----+/    |      ||     | 
   |  | | /--+----+--+------+------+-+---+-+----\  |    \++------+-------+--+------/||        |    ||| | |    | |       |  |    |     |      ||     | 
   \--+-+-+--+----+--/      |      | |   | |    |  |     ||      |       |  \-------++--------/    ||| | |    | |       |  |    |     |      ||     | 
      | \-+--+----+---------+------+-+---+-+----+--+-----++------+-------+----------++-------------+++-+-/    | |       |  |    |     |      ||     | 
      |   |  |    |         |      | |   | |    |  |     ||      |       |          ||         /---+++-+------+-+-------+--+----+--\  |      ||     | 
      |   |  |    |         |      | |   | |    |  |     \+------+-------+----------++---------+---+++-+------/ |       |  |    |  |  |      ||     | 
      |   |  |    |         |      | |   | |    |  \------+------+-------+----------++---------+---/|\-+--------/       |  |    |  |  |      ||     | 
      |   |  |    |         |      | |   | \----+---------+------+-------+----------++---------+----/  |                |  |    |  |  |      ||     | 
      |   |  |    |         |      | \---+------+---------+------+-------+----------++---------+-------+----------------+--+----+--+--/      ||     | 
      |   |  |    |         |      |     |      |         |      |       \----------++---------+-------+----------------+--+----+--+---------/|     | 
      |   |  |    |         |      |     |      |         \------+------------------/|         |       |                |  |    |  |          |     | 
      |   |  |    \---------+------+-----+------+----------------+-------------------+---------+-------/                |  \----+--+----------+-----/ 
      |   \--+--------------+------+-----+------/                |                   |         |                        |       |  |          |       
      |      |              |      |     |                       \-------------------/         |                        |       |  |          |       
      |      \->------------+------+-----/                                                     \------------------------+-------+--/          |       
      \---------------------/      \--------------->--------------------------------------------------------------------/       \-------------/       """

        val map = input.trimIndent().split("\n")

        with(crash(map)) {
            first shouldBe Pair(94, 78)
            second shouldBe Pair(26, 85)

        }
    }


    @Test
    fun test3() {
        val input = """/>-<\  
|   |  
| /<+-\
| | | v
\>+</ |
  |   ^
  \<->/"""
        crash(input.split("\n")).second shouldBe Pair(6, 4)
    }

}