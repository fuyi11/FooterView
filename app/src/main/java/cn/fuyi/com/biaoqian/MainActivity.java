package cn.fuyi.com.biaoqian;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements IClickCallBack,View.OnClickListener{

    private Button button;
    RecyclerView mRecyclerView;
    String data = "{\n" +
            "  \"msg\": \"验证通过\",\n" +
            "  \"code\": \"200\",\n" +
            "  \"result\": {\n" +
            "    \"guide\": [\n" +
            "      {\n" +
            "        \"page\": 0,\n" +
            "        \"pageSize\": 12,\n" +
            "        \"totalRecords\": 0,\n" +
            "        \"id\": 9273,\n" +
            "        \"topicName\": \"我是思维心性引导测评题目\",\n" +
            "        \"topicNameBlank\": null,\n" +
            "        \"topicType\": \"TOPIC_TYPE_RADIO\",\n" +
            "        \"score\": null,\n" +
            "        \"answer\": \"A\",\n" +
            "        \"difficulty\": \"DIFFICULT_TYPE_EASY\",\n" +
            "        \"analyseWord\": \"我是思维心性引导测评题目解析\",\n" +
            "        \"analyseVideoUrl\": null,\n" +
            "        \"analyseAudioUrl\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"status\": \"PAPER_STATUS_PUBLISH\",\n" +
            "        \"tikuSubjectId\": 33,\n" +
            "        \"tikuCategoryId\": 5,\n" +
            "        \"companyId\": 18113,\n" +
            "        \"creator\": 1137,\n" +
            "        \"creatorName\": null,\n" +
            "        \"createTime\": 1530524041000,\n" +
            "        \"updator\": 1137,\n" +
            "        \"updatorName\": null,\n" +
            "        \"updateTime\": 1530770627000,\n" +
            "        \"auditor\": 1137,\n" +
            "        \"auditorName\": null,\n" +
            "        \"auditTime\": 1530771189000,\n" +
            "        \"paperFlag\": 0,\n" +
            "        \"childFlag\": 0,\n" +
            "        \"correctFlag\": null,\n" +
            "        \"option\": [\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39698,\n" +
            "            \"topicId\": 9273,\n" +
            "            \"optionNo\": \"A\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 1,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39699,\n" +
            "            \"topicId\": 9273,\n" +
            "            \"optionNo\": \"B\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39700,\n" +
            "            \"topicId\": 9273,\n" +
            "            \"optionNo\": \"C\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39701,\n" +
            "            \"topicId\": 9273,\n" +
            "            \"optionNo\": \"D\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          }\n" +
            "        ],\n" +
            "        \"point\": {\n" +
            "          \"page\": 0,\n" +
            "          \"pageSize\": 12,\n" +
            "          \"totalRecords\": 0,\n" +
            "          \"id\": 6542,\n" +
            "          \"topicId\": 9273,\n" +
            "          \"chapterId\": null,\n" +
            "          \"sectionId\": null,\n" +
            "          \"pointId\": null,\n" +
            "          \"limit\": 12,\n" +
            "          \"start\": 0,\n" +
            "          \"firstIndex\": 0,\n" +
            "          \"totalPages\": 0,\n" +
            "          \"lastPageNo\": 0,\n" +
            "          \"nextPageNo\": 0,\n" +
            "          \"previousPageNo\": 1\n" +
            "        },\n" +
            "        \"userAnswer\": null,\n" +
            "        \"topicList\": null,\n" +
            "        \"realSum\": 0,\n" +
            "        \"sum\": 0,\n" +
            "        \"comment\": null,\n" +
            "        \"limit\": 12,\n" +
            "        \"start\": 0,\n" +
            "        \"firstIndex\": 0,\n" +
            "        \"totalPages\": 0,\n" +
            "        \"lastPageNo\": 0,\n" +
            "        \"nextPageNo\": 0,\n" +
            "        \"previousPageNo\": 1\n" +
            "      },\n" +
            "      {\n" +
            "        \"page\": 0,\n" +
            "        \"pageSize\": 12,\n" +
            "        \"totalRecords\": 0,\n" +
            "        \"id\": 9274,\n" +
            "        \"topicName\": \"我是心理健康引导测评\",\n" +
            "        \"topicNameBlank\": null,\n" +
            "        \"topicType\": \"TOPIC_TYPE_RADIO\",\n" +
            "        \"score\": null,\n" +
            "        \"answer\": \"C\",\n" +
            "        \"difficulty\": \"DIFFICULT_TYPE_EASY\",\n" +
            "        \"analyseWord\": \"我是心理健康引导测评解析\",\n" +
            "        \"analyseVideoUrl\": null,\n" +
            "        \"analyseAudioUrl\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"status\": \"PAPER_STATUS_PUBLISH\",\n" +
            "        \"tikuSubjectId\": 34,\n" +
            "        \"tikuCategoryId\": 6,\n" +
            "        \"companyId\": 18113,\n" +
            "        \"creator\": 1137,\n" +
            "        \"creatorName\": null,\n" +
            "        \"createTime\": 1530525862000,\n" +
            "        \"updator\": 1137,\n" +
            "        \"updatorName\": null,\n" +
            "        \"updateTime\": 1530771428000,\n" +
            "        \"auditor\": 1137,\n" +
            "        \"auditorName\": null,\n" +
            "        \"auditTime\": 1530771431000,\n" +
            "        \"paperFlag\": 0,\n" +
            "        \"childFlag\": 0,\n" +
            "        \"correctFlag\": null,\n" +
            "        \"option\": [\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39702,\n" +
            "            \"topicId\": 9274,\n" +
            "            \"optionNo\": \"A\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39703,\n" +
            "            \"topicId\": 9274,\n" +
            "            \"optionNo\": \"B\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39704,\n" +
            "            \"topicId\": 9274,\n" +
            "            \"optionNo\": \"C\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 1,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39705,\n" +
            "            \"topicId\": 9274,\n" +
            "            \"optionNo\": \"D\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          }\n" +
            "        ],\n" +
            "        \"point\": {\n" +
            "          \"page\": 0,\n" +
            "          \"pageSize\": 12,\n" +
            "          \"totalRecords\": 0,\n" +
            "          \"id\": 6543,\n" +
            "          \"topicId\": 9274,\n" +
            "          \"chapterId\": null,\n" +
            "          \"sectionId\": null,\n" +
            "          \"pointId\": null,\n" +
            "          \"limit\": 12,\n" +
            "          \"start\": 0,\n" +
            "          \"firstIndex\": 0,\n" +
            "          \"totalPages\": 0,\n" +
            "          \"lastPageNo\": 0,\n" +
            "          \"nextPageNo\": 0,\n" +
            "          \"previousPageNo\": 1\n" +
            "        },\n" +
            "        \"userAnswer\": null,\n" +
            "        \"topicList\": null,\n" +
            "        \"realSum\": 0,\n" +
            "        \"sum\": 0,\n" +
            "        \"comment\": null,\n" +
            "        \"limit\": 12,\n" +
            "        \"start\": 0,\n" +
            "        \"firstIndex\": 0,\n" +
            "        \"totalPages\": 0,\n" +
            "        \"lastPageNo\": 0,\n" +
            "        \"nextPageNo\": 0,\n" +
            "        \"previousPageNo\": 1\n" +
            "      },\n" +
            "      {\n" +
            "        \"page\": 0,\n" +
            "        \"pageSize\": 12,\n" +
            "        \"totalRecords\": 0,\n" +
            "        \"id\": 9275,\n" +
            "        \"topicName\": \"我是情商培养引导测评\",\n" +
            "        \"topicNameBlank\": null,\n" +
            "        \"topicType\": \"TOPIC_TYPE_RADIO\",\n" +
            "        \"score\": null,\n" +
            "        \"answer\": \"C\",\n" +
            "        \"difficulty\": \"DIFFICULT_TYPE_EASY\",\n" +
            "        \"analyseWord\": \"我是情商培养引导测评解析\",\n" +
            "        \"analyseVideoUrl\": null,\n" +
            "        \"analyseAudioUrl\": null,\n" +
            "        \"parentId\": 0,\n" +
            "        \"status\": \"PAPER_STATUS_PUBLISH\",\n" +
            "        \"tikuSubjectId\": 35,\n" +
            "        \"tikuCategoryId\": 7,\n" +
            "        \"companyId\": 18113,\n" +
            "        \"creator\": 1137,\n" +
            "        \"creatorName\": null,\n" +
            "        \"createTime\": 1530527891000,\n" +
            "        \"updator\": 1137,\n" +
            "        \"updatorName\": null,\n" +
            "        \"updateTime\": 1530772239000,\n" +
            "        \"auditor\": 1137,\n" +
            "        \"auditorName\": null,\n" +
            "        \"auditTime\": 1530772250000,\n" +
            "        \"paperFlag\": 0,\n" +
            "        \"childFlag\": 0,\n" +
            "        \"correctFlag\": null,\n" +
            "        \"option\": [\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39706,\n" +
            "            \"topicId\": 9275,\n" +
            "            \"optionNo\": \"A\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39707,\n" +
            "            \"topicId\": 9275,\n" +
            "            \"optionNo\": \"B\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39708,\n" +
            "            \"topicId\": 9275,\n" +
            "            \"optionNo\": \"C\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 1,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"page\": 0,\n" +
            "            \"pageSize\": 12,\n" +
            "            \"totalRecords\": 0,\n" +
            "            \"id\": 39709,\n" +
            "            \"topicId\": 9275,\n" +
            "            \"optionNo\": \"D\",\n" +
            "            \"optionName\": \"1\",\n" +
            "            \"correctFlag\": 0,\n" +
            "            \"score\": null,\n" +
            "            \"optionWord\": null,\n" +
            "            \"limit\": 12,\n" +
            "            \"start\": 0,\n" +
            "            \"firstIndex\": 0,\n" +
            "            \"totalPages\": 0,\n" +
            "            \"lastPageNo\": 0,\n" +
            "            \"nextPageNo\": 0,\n" +
            "            \"previousPageNo\": 1\n" +
            "          }\n" +
            "        ],\n" +
            "        \"point\": {\n" +
            "          \"page\": 0,\n" +
            "          \"pageSize\": 12,\n" +
            "          \"totalRecords\": 0,\n" +
            "          \"id\": 6544,\n" +
            "          \"topicId\": 9275,\n" +
            "          \"chapterId\": null,\n" +
            "          \"sectionId\": null,\n" +
            "          \"pointId\": null,\n" +
            "          \"limit\": 12,\n" +
            "          \"start\": 0,\n" +
            "          \"firstIndex\": 0,\n" +
            "          \"totalPages\": 0,\n" +
            "          \"lastPageNo\": 0,\n" +
            "          \"nextPageNo\": 0,\n" +
            "          \"previousPageNo\": 1\n" +
            "        },\n" +
            "        \"userAnswer\": null,\n" +
            "        \"topicList\": null,\n" +
            "        \"realSum\": 0,\n" +
            "        \"sum\": 0,\n" +
            "        \"comment\": null,\n" +
            "        \"limit\": 12,\n" +
            "        \"start\": 0,\n" +
            "        \"firstIndex\": 0,\n" +
            "        \"totalPages\": 0,\n" +
            "        \"lastPageNo\": 0,\n" +
            "        \"nextPageNo\": 0,\n" +
            "        \"previousPageNo\": 1\n" +
            "      }\n" +
            "    ],\n" +
            "    \"labelQuestion\": [\n" +
            "      {\n" +
            "        \"starId\": 1,\n" +
            "        \"labelName\": \"白领\",\n" +
            "        \"labelId\": \"1\",\n" +
            "        \"questionId\": 1,\n" +
            "        \"topicName\": \"孩子的成长目标是？\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"starId\": 1,\n" +
            "        \"labelName\": \"创业者\",\n" +
            "        \"labelId\": \"2\",\n" +
            "        \"questionId\": 1,\n" +
            "        \"topicName\": \"孩子的成长目标是？\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"starId\": 1,\n" +
            "        \"labelName\": \"老板\",\n" +
            "        \"labelId\": \"3\",\n" +
            "        \"questionId\": 1,\n" +
            "        \"topicName\": \"孩子的成长目标是？\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"starId\": 1,\n" +
            "        \"labelName\": \"老师\",\n" +
            "        \"labelId\": \"4\",\n" +
            "        \"questionId\": 1,\n" +
            "        \"topicName\": \"孩子的成长目标是？\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"starId\": 1,\n" +
            "        \"labelName\": \"学者\",\n" +
            "        \"labelId\": \"5\",\n" +
            "        \"questionId\": 1,\n" +
            "        \"topicName\": \"孩子的成长目标是？\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"labelQuestionTwo\": [\n" +
            "      {\n" +
            "        \"id\": 4,\n" +
            "        \"topicId\": null,\n" +
            "        \"itemId\": null,\n" +
            "        \"type\": null,\n" +
            "        \"tikuTopic\": null,\n" +
            "        \"topicName\": \"你的学习目标是？\",\n" +
            "        \"questionId\": 2,\n" +
            "        \"starId\": null,\n" +
            "        \"itemName\": \"哈哈\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 5,\n" +
            "        \"topicId\": null,\n" +
            "        \"itemId\": null,\n" +
            "        \"type\": null,\n" +
            "        \"tikuTopic\": null,\n" +
            "        \"topicName\": \"你的学习目标是？\",\n" +
            "        \"questionId\": 2,\n" +
            "        \"starId\": null,\n" +
            "        \"itemName\": \"嘻嘻\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 6,\n" +
            "        \"topicId\": null,\n" +
            "        \"itemId\": null,\n" +
            "        \"type\": null,\n" +
            "        \"tikuTopic\": null,\n" +
            "        \"topicName\": \"你的学习目标是？\",\n" +
            "        \"questionId\": 2,\n" +
            "        \"starId\": null,\n" +
            "        \"itemName\": \"你妹\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 1679,\n" +
            "        \"topicId\": null,\n" +
            "        \"itemId\": null,\n" +
            "        \"type\": null,\n" +
            "        \"tikuTopic\": null,\n" +
            "        \"topicName\": \"你的学习目标是？\",\n" +
            "        \"questionId\": 2,\n" +
            "        \"starId\": null,\n" +
            "        \"itemName\": \"默认学科小类\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.mRecyclerview);
        button = findViewById(R.id.btn);
         adapter= new MyAdapter(this,datas);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
        adapter.setCallBack(this);
        button.setOnClickListener(this);
         initData();


    }
    private List<TestBean> datas = new ArrayList<>();

    private void initData() {

        try{
            JSONObject obj = new JSONObject(data);
            String result = obj.getString("result");

            GengBean mbasebean = GsonUtils.getPerson(GengBean.class,result);

            List<OneBean> oneList = mbasebean.getLabelQuestion();
            List<TwoBean> twoList = mbasebean.getLabelQuestionTwo();
            List<ThreeBean> thereList = mbasebean.getGuide();

          //-------------------------------
            List<ItemBean> item = new ArrayList<>();
            for(int i = 0;i<oneList.size();i++){
                ItemBean bren = new ItemBean(oneList.get(i).getLabelId(),
                        oneList.get(i).getLabelName(),false);
                item.add(bren);
            }
            TestBean testOne = new TestBean(0,oneList.get(0).getTopicName(),
                    oneList.get(0).getQuestionId(),item);
            datas.add(testOne);

            //-------------------------------
            List<ItemBean> item2 = new ArrayList<>();
            for(int i = 0;i<twoList.size();i++){
                ItemBean bren = new ItemBean(twoList.get(i).getId(),
                        twoList.get(i).getItemName(),false);
                item2.add(bren);
            }
            TestBean testtwo = new TestBean(1,twoList.get(0).getTopicName(),
                    twoList.get(0).getQuestionId(),item2);
            datas.add(testtwo);

            //-----------------------------

            for(int x = 0; x<thereList.size();x++){

                List<ItemBean> item3 = new ArrayList<>();
                for(int y = 0;y<thereList.get(x).getOption().size();y++){
                    ItemBean bren = new ItemBean(thereList.get(x).getOption().get(y).getId(),
                            thereList.get(x).getOption().get(y).getOptionName(),false);
                    item3.add(bren);
                }
                TestBean testthere = new TestBean(0,thereList.get(x).getTopicName(),
                        thereList.get(x).getId(),item3);
                datas.add(testthere);
            }


            adapter.notifyDataSetChanged();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private List<commitBean> commitEntity = new ArrayList<>();
    private List<TempCommitBean> tempEntity = new ArrayList<>();//临时上传多选数据
    /**
     * 选题回调
     * @param tid  题目id
     * @param questionId 答案id
     * @param isCheck 是否选中
     * @param type 类型 0 为单选   1为多选
     */
    @Override
    public void callBack(int tid,int questionId, int pos,boolean isCheck,int type) {
        if(type == 0){//单选
            if(commitEntity.size() >0){
                for(int i = 0; i<commitEntity.size();i++){
                    if(tid == commitEntity.get(i).getTid()){
                        commitEntity.remove(i);
                    }
                }
            }
            commitBean bean = new commitBean(tid,String.valueOf(questionId),0);
            commitEntity.add(bean);
        }else{//多选

            if(isCheck){//如果是选中
                TempCommitBean temp = new TempCommitBean(tid,questionId);
                tempEntity.add(temp);
            }else{
                tempEntity.remove(pos);
            }


        }

    }



    @Override
    public void onClick(View v) {
        if(tempEntity.size() == 0){
            Toast.makeText(this,"多选题未做",Toast.LENGTH_LONG).show();
        }

        StringBuffer sb = new StringBuffer();
        int tid = tempEntity.get(0).getTid();
        for(int x= 0;x<tempEntity.size();x++){
            sb.append(tempEntity.get(x).getQuestionId()+",");
        }
        if(sb.length()>0){
            String up = sb.substring(0,sb.length()-1);
            for(int i = 0; i<commitEntity.size();i++){
                if(tid == commitEntity.get(i).getTid()){
                    commitEntity.remove(i);
                }
            }
            commitBean bean = new commitBean(tid,up,1);
            commitEntity.add(bean);
        }


    }
}
