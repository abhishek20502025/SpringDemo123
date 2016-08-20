package DrawApplication2;
import java.util.List;
public class triangle2 {
	private List<point> points;
	public List<point> getPoints() {
		return points;
	}
	public void setPoints(List<point> points) {
		this.points = points;
	}
	void draw(){
		for(point point:points ){
		System.out.println("triangle Points :- " + point.getX()+ " " +point.getY() );
			}
		}
	}
