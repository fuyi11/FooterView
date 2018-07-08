package cn.fuyi.com.biaoqian;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by marven on 2018/7/7.
 * 240902545@qq.com
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context context;
    List<TestBean> datas;
    private int checkColor;
    private int uncheckColor;
    public MyAdapter(Context context, List<TestBean> datas){
        this.context = context;
        this.datas = datas;
        checkColor = context.getResources().getColor(R.color.colorAccent);
        uncheckColor = context.getResources().getColor(R.color.black);
    }
    IClickCallBack call;
    public void setCallBack(IClickCallBack call){
        this.call = call;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tv.setText(datas.get(position).getTitle());
//        if(){
//            initMouMarksView( datas.get(position).getTid(),datas.get(position).getResult(),holder.lin);
//        }else{
            initMarksView( datas.get(position).getTid(),datas.get(position).getResult(),holder.lin,
                    datas.get(position).getType() );
//        }


    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
//    private void initMouMarksView(final int tid,final List<ItemBean> laberDatas, LinearLayout aa) {
//        aa.removeAllViews();
//        for ( int i = 0; i < laberDatas.size(); i++) {
//            final View view = View.inflate(context, R.layout.c_item_label, null);
//            final TextView tv = (TextView) view.findViewById(R.id.rb_label);
//            tv.setPadding(6, 0, 6, 0);
//            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//            lp.setMarginEnd(20);
//           final String title = laberDatas.get(i).getQuestion();
//            tv.setText(title);
//            if(laberDatas.get(i).isCheck()){
//                tv.setTextColor(checkColor);
//            }else{
//                tv.setTextColor(uncheckColor);
//            }
//
//            tv.setTag(i);
//            view.setTag(false);
//            final int tempi = i;
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if(laberDatas.get(tempi).isCheck()){
//                        laberDatas.get(tempi).setCheck(false);
//                        tv.setTextColor(uncheckColor);
//                    }else{
//                        laberDatas.get(tempi).setCheck(true);
//                        tv.setTextColor(checkColor);
//                    }
//                    call.callBack(tid,tempi,laberDatas.get(tempi).isCheck(),1);
//
//                }
//            });
//            aa.addView(view, lp);
//        }
//    }

    private void initMarksView(final int tid, final List<ItemBean> laberDatas, LinearLayout aa, final int type) {
        aa.removeAllViews();
        for ( int i = 0; i < laberDatas.size(); i++) {
            final View view = View.inflate(context, R.layout.c_item_label, null);
            final TextView tv = (TextView) view.findViewById(R.id.rb_label);
            tv.setPadding(6, 0, 6, 0);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.setMarginEnd(20);
            final String title = laberDatas.get(i).getQuestion();
            tv.setText(title);
            if(laberDatas.get(i).isCheck()){
                tv.setTextColor(checkColor);
            }else{
                tv.setTextColor(uncheckColor);
            }

            tv.setTag(i);
            view.setTag(false);
            final int tempi = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(type == 0){//单选
                            for(ItemBean aa: laberDatas){
                                aa.setCheck(false);
                            }
                            laberDatas.get(tempi).setCheck(true);
                            notifyDataSetChanged();

                     }else{//多选
                            if(laberDatas.get(tempi).isCheck()){
                            laberDatas.get(tempi).setCheck(false);
                            tv.setTextColor(uncheckColor);
                        }else{
                            laberDatas.get(tempi).setCheck(true);
                            tv.setTextColor(checkColor);
                        }

                    }
                    call.callBack(tid,laberDatas.get(tempi).getId(),tempi,laberDatas.get(tempi).isCheck(),type);
                    }

            });
            aa.addView(view, lp);
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv;

        LinearLayout lin;
        public ViewHolder(View view) {
            super(view);
            tv = (TextView) view.findViewById(R.id.tv);
            lin = (LinearLayout) view.findViewById(R.id.lin);
        }
    }



    }
