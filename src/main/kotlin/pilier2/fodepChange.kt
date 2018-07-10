package pilier2


data class fodepString(val ep: String, val feuillet: String,val dispru: String, val dispruPre: String, val dispruSuf: String, val colone: String)

class ParseFodep {

    fun fodepParser (x: String):String {
        val str = x;
        val ep = str.substring(16, 20);
        val feuillet = str.substring(20, 22);
        val dispru = str.substring(23, 28);
        val dispruPre = str.substring(23, 25);
        val dispruSuf = str.substring(25, 28);
        val colone = str.substring(28, 30);
        return ("ep:"+ ep + "; "+ "feuillet:" + feuillet + "; " + "dispru:"+dispru + "; " +"dispruPre:"+ dispruPre + "; " + "dispruSuf:"+dispruSuf + "; " + "colone:"+colone)
    }

    data class Rslt(val newDispruSuf: String, val value: Double)

    fun dropOne (x: String,percentage: Double):Any {
        val dispruSuf = (x.substring(25, 28).toInt()+1).toString()
        val lgt = 4-dispruSuf.length
        val newDispruSuf =  dispruSuf.padStart(lgt, '0');
        val value = x.substring(32, 50).toDouble()*percentage
        return(Rslt(newDispruSuf,value))
    }


    var a = arrayOf("20171231CF-K-006EP0101SRA00101N# 00000000100.00000","20171231CF-K-006EP0101SRA00201N# 000000000100.00000", "20171231CF-K-006EP0101SRA00301N# 00000000100.00000",
            "20171231CF-K-006EP0101SRA00401N# 00000000100.00000", "20171231CF-K-006EP0101SRA00501N# 00000000100.00000", "20171231CF-K-006EP0101SRA00601N# 00000000100.00000")
    var b = arrayOf(arrayOf("RA001","RA003","RA003"),arrayOf("RA004","RA005","RA006"))

}

