package com.example.demo.src.design_study.observer;

public class Button {

    public void onClick(){
        //이벤트 처리

        if(onClickListener != null){
            onClickListener.onClick(this);
        }

    }

    public interface OnClickListener{
        public void onClick(Button button);
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    private OnClickListener onClickListener;



}
