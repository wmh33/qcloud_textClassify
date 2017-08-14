import com.qcloud.Utilities.Json.JSONArray;
import com.qcloud.Utilities.Json.JSONObject;

/**
 * Created by wangmenghuan on 2017/8/14.
 */
public class Test {
    public static void main(String[] args){
        String str = "{\"codeDesc\":\"Success\",\"code\":0,\"tokens\":[{\"wtype\":\"副动词\",\"wtype_pos\":32,\"pos\":0,\"wlen\":\"4\",\"word\":\"持续\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":4,\"wlen\":\"4\",\"word\":\"发扬\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":8,\"wlen\":\"4\",\"word\":\"专业\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":12,\"wlen\":\"2\",\"word\":\"和\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":14,\"wlen\":\"4\",\"word\":\"创新\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":18,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":20,\"wlen\":\"4\",\"word\":\"精神\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":24,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"副形词\",\"wtype_pos\":2,\"pos\":26,\"wlen\":\"4\",\"word\":\"努力\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":30,\"wlen\":\"4\",\"word\":\"提高\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":34,\"wlen\":\"4\",\"word\":\"服务\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":38,\"wlen\":\"4\",\"word\":\"水平\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":42,\"wlen\":\"2\",\"word\":\"和\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":44,\"wlen\":\"8\",\"word\":\"盈利能力\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":52,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":54,\"wlen\":\"8\",\"word\":\"锐意进取\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":62,\"wlen\":\"4\",\"word\":\"团结\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":66,\"wlen\":\"4\",\"word\":\"进取\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":70,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"副词\",\"wtype_pos\":6,\"pos\":72,\"wlen\":\"4\",\"word\":\"不断\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":76,\"wlen\":\"4\",\"word\":\"创新\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":80,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":82,\"wlen\":\"8\",\"word\":\"迎难而上\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":90,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"副词\",\"wtype_pos\":6,\"pos\":92,\"wlen\":\"6\",\"word\":\"进一步\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":98,\"wlen\":\"4\",\"word\":\"打造\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":102,\"wlen\":\"10\",\"word\":\"核心竞争力\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":112,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"介词\",\"wtype_pos\":25,\"pos\":114,\"wlen\":\"2\",\"word\":\"以\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":116,\"wlen\":\"4\",\"word\":\"专业\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":120,\"wlen\":\"4\",\"word\":\"经营\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":124,\"wlen\":\"2\",\"word\":\"与\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":126,\"wlen\":\"4\",\"word\":\"服务\"},{\"wtype\":\"介词\",\"wtype_pos\":25,\"pos\":130,\"wlen\":\"2\",\"word\":\"为\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":132,\"wlen\":\"4\",\"word\":\"客户\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":136,\"wlen\":\"2\",\"word\":\"、\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":138,\"wlen\":\"4\",\"word\":\"员工\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":142,\"wlen\":\"2\",\"word\":\"、\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":144,\"wlen\":\"4\",\"word\":\"股东\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":148,\"wlen\":\"2\",\"word\":\"和\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":150,\"wlen\":\"4\",\"word\":\"社会\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":154,\"wlen\":\"4\",\"word\":\"创造\"},{\"wtype\":\"副词\",\"wtype_pos\":6,\"pos\":158,\"wlen\":\"2\",\"word\":\"更\"},{\"wtype\":\"形容词\",\"wtype_pos\":1,\"pos\":160,\"wlen\":\"2\",\"word\":\"大\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":162,\"wlen\":\"4\",\"word\":\"价值\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":166,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"介词\",\"wtype_pos\":25,\"pos\":168,\"wlen\":\"2\",\"word\":\"为\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":170,\"wlen\":\"4\",\"word\":\"实现\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":174,\"wlen\":\"2\",\"word\":\"\\u201c\"},{\"wtype\":\"状态词\",\"wtype_pos\":37,\"pos\":176,\"wlen\":\"4\",\"word\":\"最佳\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":180,\"wlen\":\"4\",\"word\":\"银行\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":184,\"wlen\":\"2\",\"word\":\"\\u201d\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":186,\"wlen\":\"8\",\"word\":\"战略目标\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":194,\"wlen\":\"2\",\"word\":\"而\"},{\"wtype\":\"状态词\",\"wtype_pos\":37,\"pos\":196,\"wlen\":\"4\",\"word\":\"不懈\"},{\"wtype\":\"名形词\",\"wtype_pos\":3,\"pos\":200,\"wlen\":\"4\",\"word\":\"努力\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":204,\"wlen\":\"2\",\"word\":\"。\"},{\"wtype\":\"非汉字串\",\"wtype_pos\":23,\"pos\":206,\"wlen\":\"1\",\"word\":\"\\n\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":207,\"wlen\":\"2\",\"word\":\"\\u201c\"},{\"wtype\":\"数词\",\"wtype_pos\":15,\"pos\":209,\"wlen\":\"2\",\"word\":\"两\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":211,\"wlen\":\"2\",\"word\":\"创\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":213,\"wlen\":\"2\",\"word\":\"\\u201d\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":215,\"wlen\":\"2\",\"word\":\"：\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":217,\"wlen\":\"4\",\"word\":\"创业\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":221,\"wlen\":\"2\",\"word\":\"、\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":223,\"wlen\":\"4\",\"word\":\"创新\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":227,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":229,\"wlen\":\"2\",\"word\":\"喊\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":231,\"wlen\":\"2\",\"word\":\"出\"},{\"wtype\":\"语气词\",\"wtype_pos\":36,\"pos\":233,\"wlen\":\"2\",\"word\":\"了\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":235,\"wlen\":\"2\",\"word\":\"\\u201c\"},{\"wtype\":\"介词\",\"wtype_pos\":25,\"pos\":237,\"wlen\":\"2\",\"word\":\"在\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":239,\"wlen\":\"4\",\"word\":\"改革\"},{\"wtype\":\"方位词\",\"wtype_pos\":8,\"pos\":243,\"wlen\":\"2\",\"word\":\"中\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":245,\"wlen\":\"2\",\"word\":\"求\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":247,\"wlen\":\"4\",\"word\":\"生存\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":251,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"介词\",\"wtype_pos\":25,\"pos\":253,\"wlen\":\"2\",\"word\":\"在\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":255,\"wlen\":\"4\",\"word\":\"创新\"},{\"wtype\":\"方位词\",\"wtype_pos\":8,\"pos\":259,\"wlen\":\"2\",\"word\":\"中\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":261,\"wlen\":\"2\",\"word\":\"求\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":263,\"wlen\":\"4\",\"word\":\"发展\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":267,\"wlen\":\"2\",\"word\":\"\\u201d\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":269,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":271,\"wlen\":\"4\",\"word\":\"口号\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":275,\"wlen\":\"2\",\"word\":\"。\"},{\"wtype\":\"非汉字串\",\"wtype_pos\":23,\"pos\":277,\"wlen\":\"1\",\"word\":\"\\n\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":278,\"wlen\":\"4\",\"word\":\"综合\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":282,\"wlen\":\"4\",\"word\":\"金融\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":286,\"wlen\":\"2\",\"word\":\"是\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":288,\"wlen\":\"4\",\"word\":\"全球\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":292,\"wlen\":\"8\",\"word\":\"发展趋势\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":300,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":302,\"wlen\":\"2\",\"word\":\"是\"},{\"wtype\":\"时间词\",\"wtype_pos\":29,\"pos\":304,\"wlen\":\"4\",\"word\":\"未来\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":308,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":310,\"wlen\":\"4\",\"word\":\"必然\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":314,\"wlen\":\"2\",\"word\":\"之\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":316,\"wlen\":\"2\",\"word\":\"选\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":318,\"wlen\":\"2\",\"word\":\"。\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":320,\"wlen\":\"2\",\"word\":\"\\u201c\"},{\"wtype\":\"形容词\",\"wtype_pos\":1,\"pos\":322,\"wlen\":\"4\",\"word\":\"平安\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":326,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"区别词\",\"wtype_pos\":4,\"pos\":328,\"wlen\":\"4\",\"word\":\"唯一\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":332,\"wlen\":\"4\",\"word\":\"选择\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":336,\"wlen\":\"2\",\"word\":\"是\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":338,\"wlen\":\"4\",\"word\":\"顺应\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":342,\"wlen\":\"4\",\"word\":\"客户\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":346,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":348,\"wlen\":\"4\",\"word\":\"需要\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":352,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":354,\"wlen\":\"4\",\"word\":\"顺应\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":358,\"wlen\":\"4\",\"word\":\"市场\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":362,\"wlen\":\"4\",\"word\":\"变化\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":366,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":368,\"wlen\":\"4\",\"word\":\"无论\"},{\"wtype\":\"代词\",\"wtype_pos\":27,\"pos\":372,\"wlen\":\"4\",\"word\":\"什么\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":376,\"wlen\":\"4\",\"word\":\"行业\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":380,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":382,\"wlen\":\"4\",\"word\":\"只有\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":386,\"wlen\":\"4\",\"word\":\"顺应\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":390,\"wlen\":\"4\",\"word\":\"市场\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":394,\"wlen\":\"2\",\"word\":\"和\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":396,\"wlen\":\"4\",\"word\":\"客户\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":400,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":402,\"wlen\":\"4\",\"word\":\"要求\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":406,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":408,\"wlen\":\"4\",\"word\":\"企业\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":412,\"wlen\":\"4\",\"word\":\"才能\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":416,\"wlen\":\"4\",\"word\":\"生存\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":420,\"wlen\":\"2\",\"word\":\"并\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":422,\"wlen\":\"4\",\"word\":\"获得\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":426,\"wlen\":\"10\",\"word\":\"可持续发展\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":436,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":438,\"wlen\":\"4\",\"word\":\"源泉\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":442,\"wlen\":\"2\",\"word\":\"和\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":444,\"wlen\":\"4\",\"word\":\"能力\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":448,\"wlen\":\"2\",\"word\":\"。\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":450,\"wlen\":\"4\",\"word\":\"人们\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":454,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":456,\"wlen\":\"4\",\"word\":\"时间\"},{\"wtype\":\"副词\",\"wtype_pos\":6,\"pos\":460,\"wlen\":\"6\",\"word\":\"越来越\"},{\"wtype\":\"形容词\",\"wtype_pos\":1,\"pos\":466,\"wlen\":\"4\",\"word\":\"宝贵\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":470,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"代词\",\"wtype_pos\":27,\"pos\":472,\"wlen\":\"4\",\"word\":\"他们\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":476,\"wlen\":\"4\",\"word\":\"需要\"},{\"wtype\":\"数词\",\"wtype_pos\":15,\"pos\":480,\"wlen\":\"2\",\"word\":\"一\"},{\"wtype\":\"量词\",\"wtype_pos\":26,\"pos\":482,\"wlen\":\"2\",\"word\":\"种\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":484,\"wlen\":\"2\",\"word\":\"能\"},{\"wtype\":\"形容词\",\"wtype_pos\":1,\"pos\":486,\"wlen\":\"4\",\"word\":\"省时\"},{\"wtype\":\"形容词\",\"wtype_pos\":1,\"pos\":490,\"wlen\":\"4\",\"word\":\"省力\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":494,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":496,\"wlen\":\"6\",\"word\":\"多元化\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":502,\"wlen\":\"2\",\"word\":\"、\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":504,\"wlen\":\"6\",\"word\":\"个性化\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":510,\"wlen\":\"2\",\"word\":\"、\"},{\"wtype\":\"区别词\",\"wtype_pos\":4,\"pos\":512,\"wlen\":\"6\",\"word\":\"一站式\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":518,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":520,\"wlen\":\"4\",\"word\":\"服务\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":524,\"wlen\":\"2\",\"word\":\"。\"},{\"wtype\":\"代词\",\"wtype_pos\":27,\"pos\":526,\"wlen\":\"4\",\"word\":\"这些\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":530,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"连词\",\"wtype_pos\":5,\"pos\":532,\"wlen\":\"4\",\"word\":\"只有\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":536,\"wlen\":\"4\",\"word\":\"综合\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":540,\"wlen\":\"4\",\"word\":\"金融\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":544,\"wlen\":\"4\",\"word\":\"能够\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":548,\"wlen\":\"4\",\"word\":\"做到\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":552,\"wlen\":\"2\",\"word\":\"。\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":554,\"wlen\":\"2\",\"word\":\"\\u201d\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":556,\"wlen\":\"1\",\"word\":\" \"},{\"wtype\":\"非汉字串\",\"wtype_pos\":23,\"pos\":557,\"wlen\":\"1\",\"word\":\"\\n\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":558,\"wlen\":\"2\",\"word\":\"\\u201c\"},{\"wtype\":\"介词\",\"wtype_pos\":25,\"pos\":560,\"wlen\":\"4\",\"word\":\"为了\"},{\"wtype\":\"名词\",\"wtype_pos\":16,\"pos\":564,\"wlen\":\"4\",\"word\":\"公司\"},{\"wtype\":\"形容词\",\"wtype_pos\":1,\"pos\":568,\"wlen\":\"4\",\"word\":\"长远\"},{\"wtype\":\"助词\",\"wtype_pos\":30,\"pos\":572,\"wlen\":\"2\",\"word\":\"的\"},{\"wtype\":\"名动词\",\"wtype_pos\":33,\"pos\":574,\"wlen\":\"4\",\"word\":\"发展\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":578,\"wlen\":\"2\",\"word\":\"，\"},{\"wtype\":\"代词\",\"wtype_pos\":27,\"pos\":580,\"wlen\":\"2\",\"word\":\"我\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":582,\"wlen\":\"4\",\"word\":\"情愿\"},{\"wtype\":\"介词\",\"wtype_pos\":25,\"pos\":586,\"wlen\":\"2\",\"word\":\"给\"},{\"wtype\":\"代词\",\"wtype_pos\":27,\"pos\":588,\"wlen\":\"4\",\"word\":\"人家\"},{\"wtype\":\"动词\",\"wtype_pos\":31,\"pos\":592,\"wlen\":\"4\",\"word\":\"下跪\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":596,\"wlen\":\"2\",\"word\":\"！\"},{\"wtype\":\"标点符号\",\"wtype_pos\":34,\"pos\":598,\"wlen\":\"2\",\"word\":\"\\u201d\"},{\"wtype\":\"非汉字串\",\"wtype_pos\":23,\"pos\":600,\"wlen\":\"1\",\"word\":\"\\n\"}],\"message\":\"\",\"combtokens\":[{\"pos\":26,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"努力提高\"},{\"pos\":34,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"服务水平\"},{\"pos\":44,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"盈利能力\"},{\"pos\":62,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"锐意进取\"},{\"pos\":70,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"团结进取\"},{\"pos\":80,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"不断创新\"},{\"pos\":92,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"迎难而上\"},{\"pos\":124,\"wlen\":\"10\",\"cls\":\"短语\",\"word\":\"核心竞争力\"},{\"pos\":126,\"wlen\":\"6\",\"cls\":\"短语\",\"word\":\"竞争力\"},{\"pos\":176,\"wlen\":\"4\",\"cls\":\"短语\",\"word\":\"更大\"},{\"pos\":209,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"战略目标\"},{\"pos\":215,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"不懈努力\"},{\"pos\":267,\"wlen\":\"6\",\"cls\":\"短语\",\"word\":\"求生存\"},{\"pos\":282,\"wlen\":\"6\",\"cls\":\"短语\",\"word\":\"求发展\"},{\"pos\":318,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"发展趋势\"},{\"pos\":358,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"唯一选择\"},{\"pos\":460,\"wlen\":\"10\",\"cls\":\"短语\",\"word\":\"可持续发展\"},{\"pos\":460,\"wlen\":\"6\",\"cls\":\"短语\",\"word\":\"可持续\"},{\"pos\":466,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"持续发展\"},{\"pos\":526,\"wlen\":\"8\",\"cls\":\"短语\",\"word\":\"省时省力\"},{\"pos\":0,\"wlen\":\"6\",\"cls\":\"短语\",\"word\":\"我情愿\"}]}\n";
        JSONObject json_result = new JSONObject(str);
        JSONArray jArray = json_result.getJSONArray("tokens");
        for(int i=0; i < jArray.length(); i++){
            JSONObject object = (JSONObject) jArray.get(i);
            if(String.valueOf(object.get("word")).length() >= 2){
                System.out.println(object.get("word"));
            }
        }
    }
}
