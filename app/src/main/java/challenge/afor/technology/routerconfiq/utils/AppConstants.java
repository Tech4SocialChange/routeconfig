package challenge.afor.technology.routerconfiq.utils;


/**
 * Created by touhid on 10/29/15.
 *
 * @author touhid
 */
public class AppConstants {

    public static final String API_URL = "http://kolorob.net/KolorobApi/api/";



    public static final double CAT_LIST_LG_WIDTH_PERC = 0.15;
    public static final double CAT_LIST_LG_WIDTH_PERC_NEW = 0.20;
    public static final double CAT_LIST_SM_WIDTH_PERC = 0.11;


    //region category IDs
    public static final int CAT_EDU = 101;
    public static final int CAT_FUN = 102;
    public static final int CAT_GOVT = 103;
    public static final int CAT_HEALTH = 104;
    public static final int CAT_JOB = 105;
    public static final int CAT_LAW = 106;
    public static final int CAT_MONEY = 107;
    public static final int CAT_BASE = CAT_EDU;
    public static final int CAT_INVALID = -100;
    //endregion
    //region sub-category IDs
    public static final int SUB_CAT_EDU_SCHOOL_COLLEGE = 10101;
    public static final int SUB_CAT_EDU_MADRASA = 10102;
    public static final int SUB_CAT_EDU_VOCATIONAL = 10103;
    public static final int SUB_CAT_EDU_MEDICAL = 10104;
    public static final int SUB_CAT_EDU_OTHERS = 10105;

    public static final int SUB_CAT_FUN_FIELD = 10201;
    public static final int SUB_CAT_FUN_CULT = 10202;
    public static final int SUB_CAT_FUN_TOUR = 10203;
    public static final int SUB_CAT_FUN_ELECTRONICS = 10204;
    public static final int SUB_CAT_FUN_OTHERS = 10205;

    public static final int SUB_CAT_GOVT_UTIL = 10301;
    public static final int SUB_CAT_GOVT__OFC = 10302;
    public static final int SUB_CAT_GOVT_EMRGENCY = 10303;
    public static final int SUB_CAT_GOVT_OTHERS = 10304;
    // TODO Declare other sub-category IDs
    //endregion

    //region Keys of the activity data-passing extras
    public static final String KEY_CAT_OBJ = "category_object";
    public static final String KEY_PLACE = "place";
    public static final String BAUNIABADH = "Mirpur 11";
    public static final String WAITTAG = "একটু অপেক্ষা করুন";
    public static final String WAITDET = "তথ্য সংগ্রহ হচ্ছে.....";
    public static final String PARIS_ROAD = "Mirpur 10";
    public static final int PLACE_BAUNIABADH = 1;
    public static final int PLACE_PARIS_ROAD = 2;
    //endregion

    //region Server status codঁধ

    public static final int SUCCESS_CODE = 101;
    public static final int ERR_CODE = -101;
    public static final int ERR_VOLLEY_CODE = -110;

    public static final String KEY_STATUS = "status";
    public static final String KEY_DATA = "data";
    public static final String KEY_SUCCESS = "success";
    public static final String KEY_ERROR = "error";
    //endregion



}
