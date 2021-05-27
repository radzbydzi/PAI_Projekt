package pl.pai.pai.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
public class MenuTemplate {
	static private HorizontalLayout menuInterior(com.vaadin.flow.component.Component base)
	{
		HorizontalLayout hl = new HorizontalLayout();
		//-----------------------------------------------------------
		Button home = new Button("Statystyki");
		home.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/");
			
		});
		hl.add(home);
		//-----------------------------------------------------------
		Button profil = new Button("Profil");
		profil.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/showProfil/");
			
		});
		hl.add(profil);
		//-----------------------------------------------------------
		Button myQuizes = new Button("Moje quizy");
		myQuizes.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/showMyQuizes/");
			
		});
		hl.add(myQuizes);
		//-----------------------------------------------------------
		Button mySolvedQuizes = new Button("Moje rozwiązane quizy");
		mySolvedQuizes.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/showMyFilledQuizes/");
			
		});
		hl.add(mySolvedQuizes);
		Button publicQuizes = new Button("Publiczne quizy");
		publicQuizes.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/showPublicQuizes/");
			
		});
		hl.add(publicQuizes);
		Button addQuiz = new Button("Stwórz quiz");
		addQuiz.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/add/quiz");
			
		});
		hl.add(addQuiz);
		Button mySurveys = new Button("Moje ankiety");
		mySurveys.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/showMySurveys/");
			
		});
		hl.add(mySurveys);
		//-----------------------------------------------------------
		Button mySolvedSurveys = new Button("Moje rozwiązane ankiety");
		mySolvedSurveys.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/showMyFilledSurveys/");
			
		});
		hl.add(mySolvedSurveys);
		Button publicSurveys = new Button("Publiczne ankiety");
		publicSurveys.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/showPublicSurveys/");
			
		});
		hl.add(publicSurveys);
		Button addSurvey = new Button("Stwórz ankiete");
		addSurvey.addClickListener(x->{
			base.getUI().get().getPage().setLocation("/add/survey");
			
		});
		hl.add(addSurvey);
		return hl;
	}
	
	static void addMenu(HorizontalLayout l) {
		l.add(menuInterior(l));
	}
	static void addMenu(VerticalLayout l) {
		l.add(menuInterior(l));
	}
	static void addMenu(Div l) {
		l.add(menuInterior(l));
	}
}
