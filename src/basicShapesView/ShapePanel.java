package basicShapesView;

import java.awt.*;
import java.util.ArrayList;


public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public shapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Square>();
		polygonList = new ArrayList<Polygon>();
		circleList = new ArrayList<Elipse2D>();
		ellipseList = new ArrayList<Ellipse2D>();
		triangleList = new ArrayList<Polygon>();
	}
	
	public void addRectangle()
	{
		
	}
	
	public void addSquare()
	{
		
	}
	
	public void addEllipse()
	{
		
	}
	
	public void addCircle()
	{
		
	}
	
	public void addTriangle()
	{
		int [] xPoints = new int [3];
		int [] yPoints = new int [3];
		xPoints[0] = (int)(Math.random() * 250);
		xPoints = new int []{(int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250)};
		yPoints = new int []{(int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		
		triangleList.add(triangle);
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 10) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int sides = 0; sides < numberOfSides; sides++)
		{
			xPoints[sides] = (int)(Math.random() * 300);
			yPoints[sides] = (int)(Math.random() * 300);
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
		repaint();
	}
	
	protected void paintComponents(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D
	}
	
	private void drawShape(Graphics2D mainGraphics, ArrayList shapeList)
	{
		for(Shape currentShape : shapeList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int penSize = (int)(Math.random() * 10) + 3;
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			if(currentShape instanceof Polygon)
			{
				mainGraphics.drawRect(currentShape);
			}
			else
			{
				mainGraphics.fill(currentShape);
			}
		}
	}
	
	public void clear()
	{
		
	}
}




