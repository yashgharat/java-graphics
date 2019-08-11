import java.awt.*;
import java.awt.geom.QuadCurve2D;

import javax.swing.*;

public class Paint extends JPanel{
	private static final long serialVersionUID = 8274924395221735827L;

	public void paintComponent(Graphics g2){
		super.paintComponent(g2);
		this.setBackground(new Color(43,76,93));
		Graphics2D g = (Graphics2D) g2;
		
	/*  g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25,65,100,30);
		
		g.setColor(Color.RED);
		g.setFont(new Font("TimesRoman",Font.BOLD,18));
		g.drawString("TRUMP", 274, 689); */
		
		
		// Black color for lines
		g.setColor(new Color(5,17,31));
		// The drawing of the lines
		
		g.setStroke(new BasicStroke(2));
		g.drawLine(37, 0, 37, 329);
		g.drawLine(46, 0, 46, 309);
		g.drawLine(47, 0, 47, 307);
		g.drawLine(286, 0, 286, 32);
		g.drawLine(331, 151, 341, 384);
		g.drawLine(341, 160, 350, 380);
		
		
		g.setStroke(new BasicStroke(3));
		g.drawLine(295, 0, 295, 41);
		
		g.setStroke(new BasicStroke(2));
		g.drawLine(726, 144, 726, 233);
		g.drawLine(732, 153, 732, 261);
		g.drawLine(733, 0, 733, 73);
		g.drawLine(742, 0, 742, 82);
		g.drawLine(845, 0, 845, 61);
		g.drawLine(854, 0, 854, 69);
		
		g.setStroke(new BasicStroke(3));
		g.drawLine(878, 0, 878, 384);
		g.drawLine(887, 0, 887, 379);
		
		g.setStroke(new BasicStroke(2));
		g.drawLine(921, 0, 921, 27);
		g.drawLine(931, 0, 931, 35);

		
		
		// the sign in front of trump
		
		//top sliver of sign
		g.setColor(new Color(145,137,197));
		
		int[]slivera = {113,122,906,921};
		int[]sliverb = {615,610,610,615};
		g.fillPolygon(slivera, sliverb, 4);
		
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3));
		g.drawPolygon(slivera, sliverb, 4);
		g.setStroke(new BasicStroke(1));
		
		//Main part of sign
		g.setColor(Color.BLACK);
		
		g.drawRect(110, 614, 813, 258);
		g.drawRect(111, 615, 811, 256);
		g.drawRect(112, 616, 809, 254);
		
		g.setColor(new Color(53,42,108));
		g.fillRoundRect(112,616, 809, 254, 6, 6);
		
		// The left, brighter red line
		g.setColor(new Color(120,28,93));		
		int[]xa = {447, 447, 135, 135, 208, 208, 131, 131};
		int[]ya = {636, 639, 639, 833, 833, 836, 836, 636}; 
		g.fillPolygon(xa,ya,8);
		
		// The right, darker red line
		g.setColor(new Color(66,15,74));
		int[]xb = {591, 591, 901, 901, 812, 812, 904, 904};
		int[]yb = {636, 639, 639, 834, 834, 837, 837, 636};
		g.fillPolygon(xb,yb,8);
		
		//The three stars at the top
		g.setColor(new Color(177, 24, 55));
		//g.setColor(Color.WHITE);
		
		int[]ysall = {623, 632, 634, 642, 653, 647, 653, 642, 634, 632};
		int[]xs1 = {475, 471, 459, 467, 465, 475, 485, 483, 490, 480};
		int[]xs2 = {519, 515, 503, 511, 509, 519, 529, 527, 534, 524};
		int[]xs3 = {562, 558, 546, 554, 552, 562, 572, 570, 577, 567};
		
		g.fillPolygon(xs2, ysall, 10);
		g.fillPolygon(xs1, ysall, 10);
		g.fillPolygon(xs3, ysall, 10);
		
		g.setColor(new Color(73, 22, 79));
		g.setStroke(new BasicStroke(3));
		
		g.drawPolygon(xs2, ysall, 10);
		g.drawPolygon(xs1, ysall, 10);
		g.drawPolygon(xs3, ysall, 10);
		
		g.setStroke(new BasicStroke(1));
		// The text on the sign
		g.setColor(new Color(226, 226, 228));
		
		g.setFont(new Font("SansSerif",Font.BOLD,140));
		g.drawString("TRUMP", 270, 785);
		
		g.setFont(new Font("SansSerif",Font.BOLD,33));
		g.drawString("AMERICA YOU CAN BE MY EX-WIFE!", 220, 847); 
			
			
			
			
			
			
// TIME FOR TRUMP 	
	g.setColor(new Color(223, 198, 36));
	int xpoints0[] = { 387, 389, 391, 395, 399, 401, 399, 396, 388, 383, 379, 379, 381, 385, 387, 385, 381, 378, 381, 387, 396, 404, 416, 407, 404, 405, 412, 419, 417, 429, 439, 457, 469, 475, 488, 502, 514, 537, 559, 573, 583, 580, 579, 581, 583, 588, 594, 602, 608, 610, 612, 603, 591, 579, 576, 572, 571, 564, 564, 557, 547, 543, 547, 556, 553, 552, 550, 550, 557, 564, 550, 542, 528, 519, 517, 512, 505, 504, 527, 520, 509, 487, 471, 461, 451, 434, 424, 413, 410};
	int ypoints0[] = { 206, 234, 244, 251, 253, 256, 257, 265, 268, 273, 279, 290, 297, 302, 310, 319, 325, 330, 334, 335, 336, 336, 335, 339, 343, 347, 350, 353, 356, 380, 393, 414, 417, 420, 419, 419, 413, 402, 383, 370, 357, 347, 337, 325, 310, 310, 307, 302, 294, 284, 261, 257, 254, 253, 258, 270, 272, 266, 258, 251, 239, 222, 212, 202, 194, 180, 174, 156, 148, 144, 144, 145, 145, 142, 145, 154, 158, 160, 155, 163, 174, 184, 189, 195, 200, 202, 202, 201, 202};
	g.fillPolygon(xpoints0, ypoints0,  89);
	g.setColor(Color.BLACK);
	g.setColor(new Color(34, 71, 97));
	int xpoints2[] = { 216, 227, 234, 240, 255, 265, 268, 271, 277, 283, 298, 317, 339, 359, 385, 396, 410, 415, 414, 416, 418, 424, 438, 458};
	int ypoints2[] = { 605, 580, 561, 542, 490, 446, 435, 427, 416, 413, 402, 393, 385, 374, 367, 361, 351, 356, 430, 452, 467, 497, 550, 606};
	g.fillPolygon(xpoints2, ypoints2,  24);
	int xpoints3[] = { 581, 581, 586, 593, 594, 594, 592, 580, 559, 527, 837, 828, 810, 804, 797, 789, 791, 792, 791, 780, 745, 724, 700, 678, 632, 613, 609, 604, 595, 581};
	int ypoints3[] = { 340, 344, 348, 359, 369, 379, 401, 463, 527, 607, 606, 569, 499, 476, 460, 446, 435, 414, 408, 401, 386, 379, 373, 364, 359, 356, 353, 349, 345, 340};
	g.fillPolygon(xpoints3, ypoints3,  30);
	g.setColor(Color.BLACK);
	g.setColor(Color.WHITE);
	int xpoints4[] = { 414, 412, 414, 417, 425, 428, 435, 453, 456, 530, 564, 578, 590, 594, 593, 582, 582, 582, 566, 542, 516, 495, 482, 472, 457, 448, 441};
	int ypoints4[] = { 353, 395, 424, 454, 489, 508, 538, 594, 610, 608, 517, 465, 403, 375, 354, 345, 354, 362, 380, 397, 419, 420, 420, 420, 410, 405, 394};
	g.fillPolygon(xpoints4, ypoints4,  27);
	g.setColor(new Color(168, 18, 63));
	int xpoints5[] = { 468, 481, 486, 500, 506, 512, 503, 502, 503, 503, 507, 511, 515, 522, 456, 455, 455, 458, 462, 468, 479};
	int ypoints5[] = { 445, 423, 423, 421, 439, 451, 471, 487, 509, 531, 555, 575, 593, 607, 605, 588, 570, 552, 530, 509, 475};
	g.fillPolygon(xpoints5, ypoints5,  21);
	
	g.setColor(new Color(221, 204, 197));
	int xpoints6[] = { 455, 458, 463, 473, 489, 497, 512, 521, 526, 527, 523, 525, 528, 535, 533, 527, 523, 528, 537, 540, 537, 529, 521, 511, 503, 493, 486, 480, 473, 464, 456};
	int ypoints6[] = { 219, 233, 235, 236, 233, 231, 230, 229, 235, 230, 222, 220, 224, 226, 221, 215, 213, 210, 211, 213, 202, 199, 198, 199, 203, 210, 215, 217, 220, 220, 218};
	g.fillPolygon(xpoints6, ypoints6,  31);
	int xpoints7[] = { 432, 433, 430, 426, 421, 418, 413, 408, 402, 396, 390, 385, 380, 381, 386, 388, 383, 376, 374, 373, 375, 379, 385, 374, 382, 393, 405, 408, 414, 418, 424, 427};
	int ypoints7[] = { 220, 227, 233, 234, 237, 234, 230, 230, 227, 229, 236, 243, 238, 231, 223, 221, 223, 230, 229, 225, 217, 214, 212, 212, 206, 203, 204, 209, 216, 220, 224, 223};
	g.fillPolygon(xpoints7, ypoints7,  32);
	
	g.setColor(Color.WHITE);
	int xpoints8[] = { 506, 471, 471, 475, 482, 488, 493, 498, 502, 505};
	int ypoints8[] = { 257, 258, 256, 252, 248, 248, 249, 251, 253, 257};
	g.fillPolygon(xpoints8, ypoints8,  10);
	int xpoints9[] = { 402, 410, 415, 420, 424, 428, 432, 426, 415, 406, 404};
	int ypoints9[] = { 256, 251, 248, 248, 250, 252, 255, 257, 260, 258, 258};
	g.fillPolygon(xpoints9, ypoints9,  11);
	
	


	  //Trump's Jacket
		//Fold on right side of trump
	    g.setColor(Color.BLACK);
	    g.setStroke(new BasicStroke(2));
	    
	    QuadCurve2D nexttoflag = new QuadCurve2D.Float(593, 609, 645, 508, 643, 476);
	    g.draw(nexttoflag);
	    
	    g.drawLine(586, 444, 643, 476);
	    g.drawLine(609, 455, 644, 428);

	    QuadCurve2D trjackcollar = new QuadCurve2D.Float(644, 428, 635, 355, 582, 343);
	    g.draw(trjackcollar);
	    
	    	//Flag on Trump
	    int[]fpolex = {592, 589, 593, 595};
	    int[]fpoley = {476, 507, 507, 476};
	    g.drawPolygon(fpolex, fpoley, 4);
	    
	    int[]ftotsquarex = {595, 594, 616, 623};
	    int[]ftotsquarey = {476, 498, 505, 488};
	    g.drawPolygon(ftotsquarex, ftotsquarey, 4);
	    
	    int[]fsquarex = {595, 609, 607, 595};
	    int[]fsquarey = {476, 481, 490, 490};
	    g.drawPolygon(fsquarex, fsquarey, 4);
	    
	    
	    //Outer right edge of jacket
	    QuadCurve2D top = new QuadCurve2D.Float(614, 358, 712, 369, 790, 409);
	    g.draw(top);
	    
	    QuadCurve2D topr = new QuadCurve2D.Float(790, 409, 797, 423, 790, 448);
	    g.draw(topr);
	    
	    QuadCurve2D right = new QuadCurve2D.Float(790, 448, 811, 482, 837, 609);
	    g.draw(right);
	    
	    QuadCurve2D rshoulder = new QuadCurve2D.Float(786, 415, 661, 552, 709, 596);
	    g.draw(rshoulder);
	    
	    g.drawLine(706, 576, 712, 609);

	    //Fold on left side of Trump
	    
	    QuadCurve2D opptoflag = new QuadCurve2D.Float(413, 608, 358, 508, 357, 476);
	    g.draw(opptoflag);
	    
	    g.drawLine(357, 476, 414, 446);
	    g.drawLine(360, 437, 394, 457);
	    
	    QuadCurve2D ltshoulder = new QuadCurve2D.Float(389, 374, 395, 361, 409, 355);
	    g.draw(ltshoulder);
	    
	    QuadCurve2D lshoulder = new QuadCurve2D.Float(395, 365, 255, 409, 267, 454);
	    g.draw(lshoulder);
	    
	    QuadCurve2D larm = new QuadCurve2D.Float(265, 449, 254, 519, 216, 609);
	    g.draw(larm);
	    
	    QuadCurve2D rlarm = new QuadCurve2D.Float(285, 450, 284, 526, 317, 609);
	    g.draw(rlarm);
	    
	    //Mic
	    	//Circle
	    g.setColor(new Color(25, 43, 45));   
	    g.fillOval(343, 370, 61, 64);
	    
	    g.setColor(Color.BLACK);
	    
	    g.drawOval(343, 370, 61, 64);
	    
	    QuadCurve2D inmicstickl = new QuadCurve2D.Float(372, 405, 355, 395, 353, 418);
	    g.draw(inmicstickl);

	    QuadCurve2D inmicstickr = new QuadCurve2D.Float(372, 405, 385, 420, 368, 427);
	    g.draw(inmicstickr);
	   
	    g.setColor(Color.GRAY);
	    int xpoints10[] = { 237, 265, 289, 314, 333, 348, 353, 357, 366, 373, 367, 340, 315, 300, 290, 273, 261, 256};
	    int ypoints10[] = { 605, 552, 511, 468, 444, 425, 413, 412, 410, 419, 426, 465, 502, 527, 546, 571, 602, 606};
	    g.fillPolygon(xpoints10, ypoints10,  18);
	    g.setColor(Color.BLACK);

	    QuadCurve2D micstick = new QuadCurve2D.Float(358, 412, 371, 408, 371, 421);
	    g.draw(micstick);

	    QuadCurve2D micstickl = new QuadCurve2D.Float(358, 412, 285, 492, 234, 609);
	    g.draw(micstickl);
	    
	    QuadCurve2D micstickr = new QuadCurve2D.Float(371, 421, 302, 505, 254, 609);
	    g.draw(micstickr);

	    //Inner Shirt
	    	//left side of tie
	    		//outer curve
	    //g.setStroke(new BasicStroke(1));
	    
	    QuadCurve2D Ljackend = new QuadCurve2D.Float(415, 356, 400, 455, 457, 609);
	    g.draw(Ljackend);

	    		//Inner curves
	    QuadCurve2D blcollar = new QuadCurve2D.Float(416, 445, 428, 465, 454, 487);
	    g.draw(blcollar);
	    
	    g.drawLine(454, 487, 456, 487);
	    
	    QuadCurve2D tlcollar = new QuadCurve2D.Float(456, 487, 463, 445, 483, 424);
	    g.draw(tlcollar);
	    
	    	//tie
	    		//knot
	   g.drawLine(478, 478, 468, 449);
	   g.drawLine(502, 474, 514, 454);
   
	   QuadCurve2D tknot = new QuadCurve2D.Float(478, 478, 491, 470, 502, 474);
	   g.draw(tknot);
	   
	   QuadCurve2D extknot = new QuadCurve2D.Float(486, 505, 490, 490, 492, 473);
	   g.draw(extknot);	   
	   
	   			//Actual part of tie
	   QuadCurve2D ltiecurve = new QuadCurve2D.Float(478, 478, 450, 555, 457, 609);
	   g.draw(ltiecurve);
	   
	   QuadCurve2D rtiecurve = new QuadCurve2D.Float(502, 474, 501, 563, 520, 609);
	   g.draw(rtiecurve);
	   
	   	//Right side of tie
	   		//inner curves
	   QuadCurve2D trcollar = new QuadCurve2D.Float(522, 477, 524, 470, 498, 424);
	   g.draw(trcollar);
	   g.drawLine(522, 477, 524, 477);
	  
	   QuadCurve2D brcollar = new QuadCurve2D.Float(524, 477, 567, 454, 589, 420);
	   g.draw(brcollar);
	   
	   		//outer curve
	   QuadCurve2D Rjackend = new QuadCurve2D.Float(594, 361, 600, 437, 528, 609);
	   g.draw(Rjackend);
	   
	   QuadCurve2D Rtjackend = new QuadCurve2D.Float(594, 361, 591, 351, 582, 347);
	   g.draw(Rtjackend);
	   
	 //Trump's Face
		
	    //Neck
	    //g.setStroke(new BasicStroke(1));
	    QuadCurve2D neckline = new QuadCurve2D.Float(415, 356, 476, 492, 584, 361);
		g.draw(neckline);
		
		QuadCurve2D rneck = new QuadCurve2D.Float(584, 361, 575, 338, 584, 315);
		g.draw(rneck);
		
		//Lips
		QuadCurve2D blip = new QuadCurve2D.Float(422, 357, 393, 350, 409, 340);
		g.draw(blip);
		
		QuadCurve2D mlip = new QuadCurve2D.Float(441, 343, 424, 332, 409, 340);
		g.draw(mlip);
		
		QuadCurve2D rtlip = new QuadCurve2D.Float(462, 314, 472, 320, 471, 336);
		g.draw(rtlip);
		
		
		QuadCurve2D tlip = new QuadCurve2D.Float(409, 340, 369, 344, 382, 325);
		g.draw(tlip);
		
		QuadCurve2D ttlip = new QuadCurve2D.Float(382, 325, 393, 314, 383, 302);
		g.draw(ttlip);
		
		QuadCurve2D cheek = new QuadCurve2D.Float(383, 302, 370, 282, 397, 265);
		g.draw(cheek);
		
	  //Nose
		QuadCurve2D nose1 = new QuadCurve2D.Float(442, 244, 410, 294, 414, 311);
		g.draw(nose1);
		
		QuadCurve2D nose2 = new QuadCurve2D.Float(414, 311, 420, 323, 427, 313);
		g.draw(nose2);
		
		QuadCurve2D nose3 = new QuadCurve2D.Float(427, 313, 435, 307, 444, 309);
		g.draw(nose3);
		
	  //the Left Eye of Donald Trump
		QuadCurve2D ncheek = new QuadCurve2D.Float(397, 265, 400, 277, 413, 276);
		g.draw(ncheek);
		
		QuadCurve2D lleye = new QuadCurve2D.Float(397, 265, 396, 263, 400, 259);
		g.draw(lleye);
		
		g.setStroke(new BasicStroke(3));
		g.drawLine(400, 259, 400, 256);
		g.setStroke(new BasicStroke(2));
		
		QuadCurve2D bleye = new QuadCurve2D.Float(400, 259, 415, 269, 433, 255);
		g.draw(bleye);
		
		QuadCurve2D tleye = new QuadCurve2D.Float(400, 256, 420, 236, 433, 254);
		g.draw(tleye);
		g.fillOval(409, 252, 6, 6);
		
		
		g.drawLine(400, 256, 398, 254);
		g.drawLine(398, 254, 406, 244);
		
		QuadCurve2D beyebrow = new QuadCurve2D.Float(398, 254, 389, 250, 390, 239);
		g.draw(beyebrow);
				
	  //The Right Eye of Donald Trump
		QuadCurve2D righteye = new QuadCurve2D.Float(468, 258, 488, 232, 508, 258);
		g.draw(righteye);
		g.drawLine(468, 258, 508, 258);
		
		g.fillOval(482, 249, 6, 6);
		
		QuadCurve2D breye = new QuadCurve2D.Float(471, 267, 489, 285, 509, 270);
		g.draw(breye);
		
		QuadCurve2D trreye = new QuadCurve2D.Float(518, 252, 523, 246, 531, 248);
		g.draw(trreye);
		
		QuadCurve2D brreye = new QuadCurve2D.Float(517, 261, 525, 257, 530, 263);
		g.draw(brreye);
	
	  //The ear on the right
			//Inside Ear
		QuadCurve2D inear1 = new QuadCurve2D.Float(584, 291, 584, 270, 598, 266);
		g.draw(inear1);
		
		QuadCurve2D inear2 = new QuadCurve2D.Float(591, 272, 601, 278, 595, 291);
		g.draw(inear2);
		
			//outer ear
		g.drawLine(570, 275, 572, 275);
		
		QuadCurve2D outear1 = new QuadCurve2D.Float(572, 275, 570, 266, 584, 254);
		g.draw(outear1);
		
		QuadCurve2D outear2 = new QuadCurve2D.Float(570, 308, 611, 330, 612, 267);
		g.draw(outear2);
		
	  //The Forehead of Trump
		QuadCurve2D lmforehead = new QuadCurve2D.Float(439, 218, 437, 225, 442, 233);
		g.draw(lmforehead);
		
		QuadCurve2D rmforehead = new QuadCurve2D.Float(447, 218, 445, 225, 451, 233);
		g.draw(rmforehead);
		
			//Left Eyebrow
		QuadCurve2D lsegment1 = new QuadCurve2D.Float(433, 223, 435, 238, 427, 239);
		g.draw(lsegment1);
		
		QuadCurve2D lsegment2 = new QuadCurve2D.Float(427, 239, 421, 241, 416, 235);
		g.draw(lsegment2);
		
		QuadCurve2D lsegment3 = new QuadCurve2D.Float(416, 235, 395, 221, 385, 245);
		g.draw(lsegment3);
		
		QuadCurve2D lsegment4 = new QuadCurve2D.Float(385, 245, 375, 237, 388, 222);
		g.draw(lsegment4);
		
		QuadCurve2D lsegment5 = new QuadCurve2D.Float(388, 222, 378, 226, 374, 233);
		g.draw(lsegment5);
		
		QuadCurve2D lsegment6 = new QuadCurve2D.Float(374, 233, 370, 219, 388, 214);
		g.draw(lsegment6);
		
		QuadCurve2D lsegment7 = new QuadCurve2D.Float(388, 214, 381, 214, 374, 219);
		g.draw(lsegment7);

		QuadCurve2D lsegment8 = new QuadCurve2D.Float(374, 219, 381, 207, 394, 206);
		g.draw(lsegment8);
		
		QuadCurve2D lsegment9 = new QuadCurve2D.Float(394, 206, 402, 205, 412, 215);
		g.draw(lsegment9);
		
		QuadCurve2D lsegment10 = new QuadCurve2D.Float(412, 215, 425, 239, 434, 223);
		g.draw(lsegment10);
		
			//Right Eyebrow
		QuadCurve2D rseg1 = new QuadCurve2D.Float(456, 221, 455, 233, 465, 238);
		g.draw(rseg1);
		
		g.drawLine(465,  238, 479, 238);
		
		QuadCurve2D rseg3 = new QuadCurve2D.Float(479, 238, 493, 231, 508, 233);
		g.draw(rseg3);
		
		QuadCurve2D rseg4 = new QuadCurve2D.Float(508, 233, 519, 230, 527, 236);
		g.draw(rseg4);
		
		QuadCurve2D rseg5 = new QuadCurve2D.Float(527, 236, 529, 225, 523, 222);
		g.draw(rseg5);
		
		QuadCurve2D rseg6 = new QuadCurve2D.Float(523, 222, 529, 221, 536, 228);
		g.draw(rseg6);
		
		QuadCurve2D rseg7 = new QuadCurve2D.Float(536, 228, 537, 220, 523, 214);
		g.draw(rseg7);
		
		g.drawLine(523, 214, 523, 213);
		
		QuadCurve2D rseg8 = new QuadCurve2D.Float(523, 213, 534, 210, 541, 218);
		g.draw(rseg8);
		
		QuadCurve2D rseg9 = new QuadCurve2D.Float(541, 218, 541, 198, 523, 199);
		g.draw(rseg9);
		
		QuadCurve2D rseg10 = new QuadCurve2D.Float(523, 199, 509, 196, 493, 213);
		g.draw(rseg10);
		
		QuadCurve2D rseg11 = new QuadCurve2D.Float(493, 213, 465, 231, 456, 221);
		g.draw(rseg11);
		 
	  //Hair Fill
		g.setColor(new Color(221, 204, 197));
		g.drawLine( 514, 72, 500, 72);
		int xpoints1[] = { 518, 497, 469, 459, 454, 443, 427, 418, 416, 410, 404, 395, 387, 382, 380, 381, 373, 366, 362, 360, 354, 342, 331, 326, 320, 321, 325, 331, 340, 349, 361, 372, 385, 394, 403, 412, 422, 429, 439, 445, 455, 464, 475, 491, 504, 511, 521, 526, 521, 515, 506, 503, 511, 518, 518, 531, 543, 555, 562, 557, 552, 551, 552, 552, 555, 553, 552, 555, 553, 548, 544, 544, 546, 549, 555, 564, 566, 566, 570, 575, 581, 587, 598, 607, 612, 616, 612, 610, 609, 605, 602, 595, 588, 583, 581, 580, 580, 580, 587, 589, 592, 597, 601, 604, 605, 610, 617, 620, 621, 622, 627, 630, 635, 639, 639, 636, 639, 641, 640, 638, 640, 644, 645, 646, 647, 647, 647, 646, 645, 644, 643, 641, 641, 640, 638, 634, 636, 637, 637, 633, 631, 628, 624, 620, 621, 620, 618, 612, 608, 610, 606, 603, 597, 593, 589, 586, 582, 574, 572, 565, 560, 552, 536, 528, 522};
		int ypoints1[] = { 75, 72, 79, 86, 91, 93, 101, 109, 113, 112, 116, 121, 127, 134, 141, 145, 145, 147, 152, 156, 159, 163, 168, 172, 181, 187, 197, 202, 206, 206, 205, 207, 206, 205, 203, 202, 204, 204, 204, 202, 199, 195, 190, 184, 178, 172, 165, 158, 158, 160, 161, 160, 155, 149, 144, 145, 146, 146, 146, 151, 159, 165, 170, 175, 180, 185, 190, 201, 206, 213, 222, 230, 237, 243, 249, 255, 258, 267, 268, 257, 253, 254, 256, 259, 263, 268, 268, 280, 292, 300, 305, 309, 311, 311, 322, 327, 332, 337, 334, 325, 337, 335, 331, 324, 332, 333, 327, 322, 329, 332, 327, 324, 312, 303, 296, 292, 283, 273, 262, 258, 256, 253, 249, 244, 239, 233, 228, 222, 216, 211, 213, 207, 202, 194, 189, 184, 175, 164, 155, 150, 145, 143, 140, 138, 133, 126, 122, 120, 119, 115, 109, 106, 103, 104, 99, 95, 94, 95, 91, 85, 81, 76, 74, 76, 77};
		g.fillPolygon(xpoints1, ypoints1,  165);

	  //Trump's Hair
		//ho means hair outline
		//Its going to start under his ear
		g.setColor(new Color(162, 152, 143));
		//g.setColor(Color.GRAY)
		
		g.drawLine(587, 343, 581, 338);
		
		QuadCurve2D hoseg1 = new QuadCurve2D.Float(587, 343, 585, 343, 590, 326);
		g.draw(hoseg1);
		
		g.drawLine(590,  326, 591, 341);
		
		QuadCurve2D hoseg3 = new QuadCurve2D.Float(591, 341, 601, 337, 604, 325);
		g.draw(hoseg3);
		
		g.drawLine(604, 325, 605, 338);
		
		QuadCurve2D hoseg5 = new QuadCurve2D.Float(605, 338, 617, 332, 621, 318);
		g.draw(hoseg5);
		
		g.drawLine(621, 318, 621, 336);
		
		QuadCurve2D hoseg7 = new QuadCurve2D.Float(621, 336, 639, 317, 639, 296);
		g.draw(hoseg7);
		
		g.drawLine(639, 296, 637, 294);
		
		QuadCurve2D hoseg9 = new QuadCurve2D.Float(633, 300, 645, 279, 639, 261);
		g.draw(hoseg9);
		
		QuadCurve2D hoseg10 = new QuadCurve2D.Float(639, 261, 650, 249, 646, 232);
		g.draw(hoseg10);
		
		QuadCurve2D hoseg11 = new QuadCurve2D.Float(646, 232, 647, 219, 641, 211);
		g.draw(hoseg11);
		
		QuadCurve2D hoseg12 = new QuadCurve2D.Float(641, 211, 643, 194, 634, 187);
		g.draw(hoseg12);
		
		QuadCurve2D hoseg13 = new QuadCurve2D.Float(634, 187, 647, 159, 621, 138);
		g.draw(hoseg13);
		
		g.drawLine(621, 138, 616, 145);
		
		QuadCurve2D hoseg14 = new QuadCurve2D.Float(621, 138, 625, 126, 611, 120);
		g.draw(hoseg14);
		
		QuadCurve2D hoseg14_ = new QuadCurve2D.Float(611, 120, 602, 121, 602, 128);
		g.draw(hoseg14_);
		
		QuadCurve2D hoseg15 = new QuadCurve2D.Float(611, 120, 613, 114, 600, 105);
		g.draw(hoseg15);
		
		g.drawLine(600, 105, 594, 105);
		
		QuadCurve2D hoseg15_ = new QuadCurve2D.Float(594, 105, 587, 108, 590, 116);
		g.draw(hoseg15_);
		
		QuadCurve2D hoseg16 = new QuadCurve2D.Float(594, 105, 586, 93, 575, 96);
		g.draw(hoseg16);
		
		g.drawLine(575, 96, 571, 104);
		
		QuadCurve2D hoseg17 = new QuadCurve2D.Float(575, 96, 560, 76, 541, 77);
		g.draw(hoseg17);
		
		QuadCurve2D hoseg17_ = new QuadCurve2D.Float(541, 77, 527, 75, 507, 90);
		g.draw(hoseg17_);
		
		QuadCurve2D hoseg18 = new QuadCurve2D.Float(524, 78, 477, 62, 444, 103);
		g.draw(hoseg18);
		
		QuadCurve2D hoseg19 = new QuadCurve2D.Float(452, 93, 415, 102, 410, 133);
		g.draw(hoseg19);
		
		QuadCurve2D hoseg19_ = new QuadCurve2D.Float(410, 133, 418, 149, 458, 140);
		g.draw(hoseg19_);
		
		QuadCurve2D hoseg20 = new QuadCurve2D.Float(420, 111, 379, 125, 381, 145);
		g.draw(hoseg20);
		
		QuadCurve2D hoseg20_ = new QuadCurve2D.Float(381, 145, 379, 166, 401, 161);
		g.draw(hoseg20_);
		
		QuadCurve2D hoseg21 = new QuadCurve2D.Float(381, 145, 357, 148, 359, 167);
		g.draw(hoseg21);
		
		QuadCurve2D hoseg21_ = new QuadCurve2D.Float(359, 167, 355, 199, 411, 204);
		g.draw(hoseg21_);
		
		QuadCurve2D hoseg22 = new QuadCurve2D.Float(361, 159, 322, 168, 321, 185);
		g.draw(hoseg22);
		
		QuadCurve2D hoseg22_ = new QuadCurve2D.Float(321, 185, 320, 211, 358, 208);
		g.draw(hoseg22_);
		
		QuadCurve2D hoseg23 = new QuadCurve2D.Float(344, 194, 354, 217, 411, 204);
		g.draw(hoseg23);
		
		QuadCurve2D hoseg24 = new QuadCurve2D.Float(411, 204, 438, 211, 464, 198);
		g.draw(hoseg24);
		
		QuadCurve2D hoseg25 = new QuadCurve2D.Float(424, 198, 464, 204, 492, 184);
		g.draw(hoseg25);
		
		QuadCurve2D hoseg26 = new QuadCurve2D.Float(410, 172, 473, 205, 509, 176);
		g.draw(hoseg26);
		
		QuadCurve2D hoseg27 = new QuadCurve2D.Float(452, 167, 514, 191, 527, 157);
		g.draw(hoseg27);
		
		QuadCurve2D hoseg28 = new QuadCurve2D.Float(527, 157, 513, 167, 494, 161);
		g.draw(hoseg28);
		
		QuadCurve2D hoseg29 = new QuadCurve2D.Float(503, 162, 519, 154, 519, 146);
		g.draw(hoseg29);
		
		QuadCurve2D hoseg30 = new QuadCurve2D.Float(501, 114, 485, 137, 526, 147);
		g.draw(hoseg30);
		
		QuadCurve2D hoseg30_ = new QuadCurve2D.Float(526, 147, 541, 150, 563, 147);
		g.draw(hoseg30_);
		
		QuadCurve2D hoseg31 = new QuadCurve2D.Float(538, 107, 524, 131, 563, 147);
		g.draw(hoseg31);
		
		QuadCurve2D hoseg32 = new QuadCurve2D.Float(563, 147, 607, 136, 619, 166);
		g.draw(hoseg32);
		
		QuadCurve2D hoseg32_ = new QuadCurve2D.Float(563, 116, 557, 128, 584, 145);
		g.draw(hoseg32_);
		
		QuadCurve2D hoseg33 = new QuadCurve2D.Float(584, 145, 550, 146, 551, 168);
		g.draw(hoseg33);
		
		QuadCurve2D hoseg33_ = new QuadCurve2D.Float(551, 168, 547, 189, 584, 190);
		g.draw(hoseg33_);
		
		QuadCurve2D hoseg33_1 = new QuadCurve2D.Float(584, 190, 631, 191, 644, 218);
		g.draw(hoseg33_1);
		
		QuadCurve2D hoseg34 = new QuadCurve2D.Float(556, 182, 550, 186, 553, 195);
		g.draw(hoseg34);
		
		QuadCurve2D hoseg34_ = new QuadCurve2D.Float(553, 196, 552, 214, 579, 230);
		g.draw(hoseg34_);
		
		QuadCurve2D hoseg35 = new QuadCurve2D.Float(555, 204, 526, 236, 568, 260);
		g.draw(hoseg35);
		
		QuadCurve2D hoseg36 = new QuadCurve2D.Float(565, 259, 563, 269, 570, 275);
		g.draw(hoseg36);
		
		QuadCurve2D hoseg37 = new QuadCurve2D.Float(573, 237, 574, 254, 597, 258);
		g.draw(hoseg37);
		
		QuadCurve2D hoseg37_ = new QuadCurve2D.Float(597, 258, 618, 262, 621, 281);
		g.draw(hoseg37_);
		
		QuadCurve2D hoseg38 = new QuadCurve2D.Float(609, 218, 641, 234, 638, 263);
		g.draw(hoseg38);
		
		QuadCurve2D hoseg39 = new QuadCurve2D.Float(646, 234, 635, 210, 608, 206);
		g.draw(hoseg39);
		
		QuadCurve2D hoseg39_ = new QuadCurve2D.Float(608, 206, 584, 205, 573, 195);
		g.draw(hoseg39_);
		
		QuadCurve2D hoseg40 = new QuadCurve2D.Float(600, 235, 619, 237, 625, 261);
		g.draw(hoseg40);
	
	//DORA THE EXPLORER
		Image img1 = Toolkit.getDefaultToolkit().getImage("Dora.gif");
		g.drawImage(img1, 30, 0, this);
		g.finalize();
		
		
	  //The Way to draw a proper bezier curve, with its proof.
	  /*g.setColor(Color.RED);
		g.drawLine(50, 300, 200, 200);
		g.drawLine(200, 200 , 350, 300);
		g.drawLine(50, 300, 350, 300);
		g.drawLine(125,250,275,250);
		
	  g.setColor(Color.YELLOW);
		QuadCurve2D quadcurve = new QuadCurve2D.Float(50,300,200,200,350,300);
		g.draw(quadcurve);*/
		
		//This problem was fixed by adding the difference to the screen dimensions. But why the problem was there, makes no sense
		/*g.setColor(Color.WHITE);
		 For some reason this is the maximum edge of the screen on the right
			the x value is maxed out at 923
		g.drawLine(940, 0, 940, 888);
		
		 For some reason this is the maximum edge of the screen on the bottom
		 	the y value is maxed out at 848
		g.drawLine(0, 888, 940, 888);*/
	}
}


