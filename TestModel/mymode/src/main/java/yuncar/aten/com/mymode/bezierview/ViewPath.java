package yuncar.aten.com.mymode.bezierview;

import java.util.ArrayList;
import java.util.Collection;

/**
 * project:UMPush
 * package:yuncar.aten.com.paths
 * Created by 佘少雄 on 2018/7/6.
 * e-mail : 610184089@qq.com
 * 入口
 *    path.moveTo(0, 0);
       path.lineTo(gg, 0);
      path.curveTo( gg+400 , 600 ,gg-400  , 1200 , gg, 0);
     ObjectAnimator anim = ObjectAnimator.ofObject(this,"fabLoc",new ViewPathEvaluator(),path.getPoints().toArray());


      public void setFabLoc(ViewPoint newLoc){
      imageButton.setTranslationX(newLoc.x);
      imageButton.setTranslationY(newLoc.y);
 }
 */

    public class ViewPath {

        public static final int MOVE = 0;
        public static final int LINE = 1;
        public static final int QUAD = 2;
        public static final int CURVE = 3;

        private ArrayList<ViewPoint> mPoints;


        public ViewPath() {
            mPoints = new ArrayList<>();
        }

        public void moveTo(float x, float y){
            mPoints.add(ViewPoint.moveTo(x,y,MOVE));
        }

        public void lineTo(float x,float y){
            mPoints.add(ViewPoint.lineTo(x,y,LINE));
        }

        public void curveTo(float x,float y,float x1,float y1,float x2,float y2){
            mPoints.add(ViewPoint.curveTo(x,y,x1,y1,x2,y2,CURVE));
        }

        public void quadTo(float x,float y,float x1,float y1){
            mPoints.add(ViewPoint.quadTo(x,y,x1,y1,QUAD));
        }

        public Collection<ViewPoint> getPoints() {
            return mPoints;
        }

    }
