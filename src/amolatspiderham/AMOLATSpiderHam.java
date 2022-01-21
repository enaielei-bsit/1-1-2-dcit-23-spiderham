package amolatspiderham;
import javax.swing.*;
import java.awt.*;
public class AMOLATSpiderHam extends JPanel {
    
    public static int xsize=500, ysize=700, xoff=0, yoff=10;
    
    public static void main(String[] args) {
        AMOLATSpiderHam panel = new AMOLATSpiderHam();
        JFrame window = new JFrame("SPIDER-HAM | Nommel Isanar Lavapie Amolat - BSIT 1-1");
        window.setContentPane(panel);
        window.setSize(xsize, ysize);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    public void paintComponent(Graphics g){
        
        Color red = new Color(200,0,0);
        Color blue = new Color(0, 0, 200);
        Color white = new Color(230, 230, 230);
        Color black = new Color(30, 30, 30);
        Color red2 = new Color(150, 0, 0);
        Color red3 = new Color(140, 0, 0);
        Color red4 = new Color(180, 0, 0);
        Color bgcolor = new Color(192,192,192);
        
        //----------BACKGROUND----------
        g.setColor(bgcolor);
        g.fillRect(0, 0, xsize, ysize);
        //----------END OF BACKGROUND----------
        
        //----------HEADING----------
        Font myfont = new Font("Trebuchet MS", Font.BOLD, 50);
        Font myfont2 = new Font("Trebuchet MS", Font.BOLD, 12);
        g.setFont(myfont);
        g.setColor(blue);
        g.fillRect(0, 27, xsize, 20);
        g.setColor(blue);
        g.fillRoundRect(100, 3, 300, 70, 10, 10);
        g.setColor(red);
        g.fillRoundRect(105, 8, 290, 60, 10, 10);
        g.setColor(white);
        g.drawString("SPIDER-HAM", 110, 56);
        g.setFont(myfont2);
        g.drawString("NILA - BSIT 1-1", 8, 41);
        g.drawString("March 3, 2019", xsize-90, 41);
        //----------END OF HEADING----------
        
        //----------BASE MESH----------
        
        //Ears
        g.setColor(red);
        int[] xEarsPoly={210, 182, 180, 175, 160, 130, 100, 145, 170, 179, 187, 197};
        int[] yEarsPoly={130, 85, 80, 70, 85, 115, 140, 123, 110, 125, 135, 145};
        int lEarsPoly=xEarsPoly.length;
        for(int x=0; x<lEarsPoly; x++){
            xEarsPoly[x]+=xoff; yEarsPoly[x]+=yoff;
        }
        g.fillPolygon(xEarsPoly, yEarsPoly, lEarsPoly);
        
        g.setColor(red2);
        int[] xEarsPoly3={210, 172, 170, 175, 160, 130, 100, 145, 170, 179, 187, 197};
        int[] yEarsPoly3={130, 85, 90, 80, 95, 115, 140, 123, 110, 125, 135, 145};
        int lEarsPoly3=xEarsPoly3.length;
        for(int x=0; x<lEarsPoly3; x++){
            xEarsPoly3[x]+=xoff; yEarsPoly3[x]+=yoff;
        }
        g.fillPolygon(xEarsPoly3, yEarsPoly3, lEarsPoly3);
        
        g.setColor(red);
        int[] xEarsPoly1={xsize-210, xsize-182, xsize-180, xsize-175, xsize-160, xsize-130, xsize-100, xsize-145, xsize-170, xsize-179, xsize-187, xsize-197};
        int[] yEarsPoly1={130, 85, 80, 70, 85, 115, 140, 123, 110, 125, 135, 145};
        int lEarsPoly1=xEarsPoly1.length;
        for(int x=0; x<lEarsPoly1; x++){
            xEarsPoly1[x]+=xoff; yEarsPoly1[x]+=yoff;
        }
        g.fillPolygon(xEarsPoly1, yEarsPoly1, lEarsPoly1);
        
         g.setColor(red2);
        int[] xEarsPoly4={xsize-210, xsize-172, xsize-170, xsize-175, xsize-160, xsize-130, xsize-100, xsize-145, xsize-170, xsize-179, xsize-187, xsize-197};
        int[] yEarsPoly4={130, 85, 90, 80, 95, 115, 140, 123, 110, 125, 135, 145};
        int lEarsPoly4=xEarsPoly4.length;
        for(int x=0; x<lEarsPoly4; x++){
            xEarsPoly4[x]+=xoff; yEarsPoly4[x]+=yoff;
        }
        g.fillPolygon(xEarsPoly4, yEarsPoly4, lEarsPoly4);
        
        g.setColor(red3);
        g.drawLine(173+xoff, 80+yoff, 170+xoff, 111+yoff); g.drawLine(172+xoff, 80+yoff, 169+xoff, 111+yoff);
        g.drawLine((xsize-173)+xoff, 80+yoff, (xsize-170)+xoff, 111+yoff); g.drawLine((xsize-172)+xoff, 80+yoff, (xsize-169)+xoff, 111+yoff);
        //End of Ears
        
        //Face
        g.setColor(red);
        int[] xFacePoly={135, 180, 200, 220, 225, 227, 227, 227, xsize-227, xsize-227, xsize-227, xsize-225, xsize-220, xsize-200, xsize-180, xsize-135};
        int[] yFacePoly={330, 350, 360, 370, 375, 380, 385, 387, 387, 385, 380, 375, 370, 360, 350, 330};
        int lFacePoly=xFacePoly.length;
        for(int x=0; x<lFacePoly; x++){
            xFacePoly[x]+=xoff; yFacePoly[x]+=yoff;
        }
        g.fillPolygon(xFacePoly, yFacePoly, lFacePoly);

        g.setColor(white);
        int[] xFacePoly1={153, 137, 134, 135, 136, 140, 145, 165, xsize-165, xsize-145, xsize-140, xsize-136, xsize-135, xsize-134, xsize-137, xsize-153};
        int[] yFacePoly1={315, 250, 230, 215, 200, 192, 183, 161, 161, 183, 192, 200, 215, 230, 250, 315};
        int lFacePoly1=xFacePoly1.length;
        for(int x=0; x<lFacePoly1; x++){
            xFacePoly1[x]+=xoff; yFacePoly1[x]+=yoff;
        }
        g.fillPolygon(xFacePoly1, yFacePoly1, lFacePoly1);
        
        g.setColor(white);
        g.fillArc(134+xoff, 121+yoff, 231, 190, 180, -180);
        g.setColor(red);
        g.fillArc(140+xoff, 121+yoff, 221, 190, 200, 360);
        
        g.setColor(red);
        int[] xFacePoly3={142, 148, 153, 153, xsize-153, xsize-153, xsize-148, xsize-142};
        int[] yFacePoly3={230, 275, 315, 330, 330, 315, 275, 230};
        int lFacePoly3=xFacePoly3.length;
        for(int x=0; x<lFacePoly3; x++){
            xFacePoly3[x]+=xoff; yFacePoly3[x]+=yoff;
        }
        g.fillPolygon(xFacePoly3, yFacePoly3, lFacePoly3);
        
        g.setColor(white);
        g.fillOval(132+xoff, 300+yoff, 235, 50);
        g.setColor(red);
        g.fillOval(225+xoff, 306+yoff, 135, 42);
        g.fillOval(137+xoff, 305+yoff, 135, 42);
        //End of Face

        //Shoulders
        g.setColor(white);
        g.fillArc(166+xoff, 375+yoff, 75, 70, 180, -180);
        g.setColor(red);
        g.fillArc(171+xoff, 377+yoff, 70, 65, 180, -180);
        g.setColor(red);
        g.fillArc((xsize-242)+xoff, 375+yoff, 75, 70, 180, -180);
        //End of Shoulders
        
        //Arms
        g.setColor(white);
        int[] xArmsPoly={170, 120, 150, 235};
        int[] yArmsPoly={395, 445, 455, 408};
        int lArmsPoly=xArmsPoly.length;
        for(int x=0; x<lArmsPoly; x++){
            xArmsPoly[x]+=xoff; yArmsPoly[x]+=yoff;
        }
        g.fillPolygon(xArmsPoly, yArmsPoly, lArmsPoly);
        
        g.setColor(red);
        int[] xArmsPoly4={170+5, 120+5, 150, 235};
        int[] yArmsPoly4={395, 445, 455, 408};
        int lArmsPoly4=xArmsPoly4.length;
        for(int x=0; x<lArmsPoly4; x++){
            xArmsPoly4[x]+=xoff; yArmsPoly4[x]+=yoff;
        }
        g.fillPolygon(xArmsPoly4, yArmsPoly4, lArmsPoly4);
        
        int[] xArmsPoly1={123, 135, 145, 157, 167, 190, 200, 145};
        int[] yArmsPoly1={478, 482, 485, 488, 491, 496, 470, 450};
        int lArmsPoly1=xArmsPoly1.length;
        for(int x=0; x<lArmsPoly1; x++){
            xArmsPoly1[x]+=xoff; yArmsPoly1[x]+=yoff;
        }
        g.fillPolygon(xArmsPoly1, yArmsPoly1, lArmsPoly1);
        
        int[] xArmsPoly2={xsize-170, xsize-120, xsize-150, xsize-235};
        int[] yArmsPoly2={395, 445, 455, 408};
        int lArmsPoly2=xArmsPoly2.length;
        for(int x=0; x<lArmsPoly2; x++){
            xArmsPoly2[x]+=xoff; yArmsPoly2[x]+=yoff;
        }
        g.fillPolygon(xArmsPoly2, yArmsPoly2, lArmsPoly2);
        
        g.setColor(red);
        int[] xArmsPoly3={xsize-123, xsize-135, xsize-145, xsize-157, xsize-167, xsize-190, xsize-200, xsize-145};
        int[] yArmsPoly3={478, 482, 485, 488, 491, 496, 470, 450};
        int lArmsPoly3=xArmsPoly3.length;
        for(int x=0; x<xArmsPoly3.length; x++){
            xArmsPoly3[x]+=xoff; yArmsPoly3[x]+=yoff;
        }
        g.fillPolygon(xArmsPoly3, yArmsPoly3, lArmsPoly3);
        
        g.setColor(white);
        g.fillArc(115+xoff, 440+yoff, 30, 40, 90, 180);
        g.setColor(red);
        g.fillArc(120+xoff, 440+yoff, 25, 40, 90, 180);
        g.setColor(red);
        g.fillArc(355+xoff, 440+yoff, 30, 40, 90, -180);
        //End of Arms
        
        //Hands
        g.setColor(white);
        g.fillArc(160+xoff, 480+yoff, 30, 40, 140, 360);
        g.setColor(red);
        g.fillArc(162+xoff, 478+yoff, 32, 40, 140, 360);
        g.fillArc(305+xoff, 480+yoff, 30, 40, 185, 360);
        g.fillOval(172+xoff, 450+yoff, 50, 40);
        g.fillOval(279+xoff, 450+yoff, 50, 40);
        //End of Hands
        
        //Legs
        g.setColor(white);
        int[] xLegsPoly={203, 200, 220, 250, xsize-220, xsize-200, xsize-203};
        int[] yLegsPoly={500, 620, 630, 547, 630, 620, 500};
        int lLegsPoly=xLegsPoly.length;
        for(int x=0; x<lLegsPoly; x++){
            xLegsPoly[x]+=xoff; yLegsPoly[x]+=yoff;
        }
        g.fillPolygon(xLegsPoly, yLegsPoly, lLegsPoly);
        
        g.setColor(red);
        int[] xLegsPoly2={208, 205, 220, 252, xsize-217, xsize-200, xsize-203};
        int[] yLegsPoly2={500, 625, 630, 547, 630, 620, 500};
        int lLegsPoly2=xLegsPoly2.length;
        for(int x=0; x<lLegsPoly2; x++){
            xLegsPoly2[x]+=xoff; yLegsPoly2[x]+=yoff;
        }
        g.fillPolygon(xLegsPoly2, yLegsPoly2, lLegsPoly2);
        //End of Legs
        
        //Feet
        g.setColor(white);
        int[] xFeetPoly6={200, 155, 145, 137, 134, 133, 137, 140, 155, 220};
        int[] yFeetPoly6={620, 610, 612, 618, 622, 629, 630, 631, 632, 630};
        int lFeetPoly6=xFeetPoly6.length;
        for(int x=0; x<lFeetPoly6; x++){
            xFeetPoly6[x]+=xoff; yFeetPoly6[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly6, yFeetPoly6, lFeetPoly6);
        
        g.setColor(red);
        int[] xFeetPoly2={200, 155, 150, 142, 139, 138, 137, 140, 155, 220};
        int[] yFeetPoly2={620, 610, 612, 618, 622, 629, 630, 631, 632, 630};
        int lFeetPoly2=xFeetPoly2.length;
        for(int x=0; x<lFeetPoly2; x++){
            xFeetPoly2[x]+=xoff; yFeetPoly2[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly2, yFeetPoly2, lFeetPoly2);

        g.setColor(white);
        int[] xFeetPoly5={200, 170, 160, 152, 149, 148, 152, 155, 170, 220};
        int[] yFeetPoly5={620, 618, 620, 626, 630, 637, 638, 639, 640, 630};
        int lFeetPoly5=xFeetPoly5.length;
        for(int x=0; x<lFeetPoly5; x++){
            xFeetPoly5[x]+=xoff; yFeetPoly5[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly5, yFeetPoly5, lFeetPoly5);
        
        g.setColor(red);
        int[] xFeetPoly={200, 170, 165, 157, 154, 153, 152, 155, 170, 220};
        int[] yFeetPoly={620, 618, 620, 626, 630, 637, 638, 639, 640, 630};
        int lFeetPoly=xFeetPoly.length;
        for(int x=0; x<lFeetPoly; x++){
            xFeetPoly[x]+=xoff; yFeetPoly[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly, yFeetPoly, lFeetPoly);
        
        g.setColor(white);
        int[] xFeetPoly7={xsize-200, xsize-155, xsize-145, xsize-137, xsize-134, xsize-133, xsize-137, xsize-140, xsize-155, xsize-220};
        int[] yFeetPoly7={620, 610, 612, 618, 622, 629, 630, 631, 632, 630};
        int lFeetPoly7=xFeetPoly7.length;
        for(int x=0; x<lFeetPoly7; x++){
            xFeetPoly7[x]+=xoff; yFeetPoly7[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly7, yFeetPoly7, lFeetPoly7);
        
        g.setColor(red);
        int[] xFeetPoly4={xsize-200, xsize-155, xsize-145, xsize-137, xsize-134, xsize-133, xsize-137, xsize-140, xsize-155, xsize-220};
        int[] yFeetPoly4={620, 610, 614, 622, 622, 629, 630, 631, 632, 630};
        int lFeetPoly4=xFeetPoly4.length;
        for(int x=0; x<lFeetPoly4; x++){
            xFeetPoly4[x]+=xoff; yFeetPoly4[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly4, yFeetPoly4, lFeetPoly4);
        
        g.setColor(white);
        int[] xFeetPoly8={xsize-200, xsize-170, xsize-160, xsize-152, xsize-149, xsize-148, xsize-152, xsize-155, xsize-170, xsize-220};
        int[] yFeetPoly8={620, 618, 620, 626, 630, 637, 638, 639, 640, 630};
        int lFeetPoly8=xFeetPoly8.length;
        for(int x=0; x<lFeetPoly8; x++){
            xFeetPoly8[x]+=xoff; yFeetPoly8[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly8, yFeetPoly8, lFeetPoly8);
        
        g.setColor(red);
        int[] xFeetPoly3={xsize-200, xsize-170, xsize-160, xsize-152, xsize-149, xsize-148, xsize-152, xsize-155, xsize-170, xsize-220};
        int[] yFeetPoly3={620, 620, 622, 626, 630, 637, 638, 639, 640, 630};
        int lFeetPoly3=xFeetPoly3.length;
        for(int x=0; x<lFeetPoly3; x++){
            xFeetPoly3[x]+=xoff; yFeetPoly3[x]+=yoff;
        }
        g.fillPolygon(xFeetPoly3, yFeetPoly3, lFeetPoly3);
        //End of Feet
        
        //Body
        g.setColor(red);
        g.fillOval(185+xoff, 407+yoff, 130, 140);
        g.fillOval(265+xoff, 417+yoff, 50, 70);
        g.fillOval(185+xoff, 417+yoff, 50, 70);
        //End of Body
        
        //Patches
        g.setColor(red);
        g.fillRect(128+xoff, 445+yoff, 25, 27); g.fillRect(348+xoff, 445+yoff, 25, 27);
        g.fillRect(200+xoff, 400+yoff, 25, 27); g.fillRect(275+xoff, 400+yoff, 25, 27);
        g.fillRect(227+xoff, 330+yoff, 45, 120);
        
        int[] xPatchesPoly={220, 210, 185, 180, xsize-180, xsize-185, xsize-210, xsize-220};
        int[] yPatchesPoly={400, 455, 457, 485, 485, 457, 455, 400};
        int lPatchesPoly=xPatchesPoly.length;
        for(int x=0; x<lPatchesPoly; x++){
            xPatchesPoly[x]+=xoff; yPatchesPoly[x]+=yoff;
        }
        g.fillPolygon(xPatchesPoly, yPatchesPoly, lPatchesPoly);
        
        int[] xPatchesPoly2={165, 150, 175, 200, xsize-200, xsize-175, xsize-150, xsize-165};
        int[] yPatchesPoly2={300, 325, 340, 355, 355, 340, 325, 300};
        int lPatchesPoly2=xPatchesPoly2.length;
        for(int x=0; x<lPatchesPoly2; x++){
            xPatchesPoly2[x]+=xoff; yPatchesPoly2[x]+=yoff;
        }
        g.fillPolygon(xPatchesPoly2, yPatchesPoly2, lPatchesPoly2);
        
        g.setColor(red);
        int[] xPatchesPoly3={230, 220, 210, 208, xsize-202, xsize-210, xsize-220, xsize-230};
        int[] yPatchesPoly3={535, 555, 555, 520, 520, 555, 555, 535};
        int lPatchesPoly3=xPatchesPoly3.length;
        for(int x=0; x<lPatchesPoly3; x++){
            xPatchesPoly3[x]+=xoff; yPatchesPoly3[x]+=yoff;
        }
        g.fillPolygon(xPatchesPoly3, yPatchesPoly3, lPatchesPoly3);
        
        g.setColor(red);
        
        g.setColor(red);
        g.fillOval(262+xoff, 413+yoff, 50, 100);
        g.fillOval(187+xoff, 413+yoff, 50, 100);
        
        g.setColor(blue);
        int[] xBodyPoly={208, 202, 200, 202, 205, 213, 208, 188, 168, 148, 140, 145, 158, 167, 153, 189, 186, 186, 188, 189, 191};
        int[] yBodyPoly={503, 478, 458, 438, 418, 398, 396, 410, 425, 440, 450, 455, 462, 458, 454, 434, 444, 464, 484, 490, 498};
        int lBodyPoly=xBodyPoly.length;
        for(int x=0; x<lBodyPoly; x++){
            xBodyPoly[x]+=xoff; yBodyPoly[x]+=yoff;
        }
        g.fillPolygon(xBodyPoly, yBodyPoly, lBodyPoly);
        
        g.setColor(white);
        int[] xBodyPoly1={193, 192, 189, 188, 189, 186, 185, 186, 190, 193};
        int[] yBodyPoly1={505, 498, 478, 460, 436, 436, 458, 478, 498, 505};
        int lBodyPoly1=xBodyPoly1.length;
        for(int x=0; x<lBodyPoly1; x++){
            xBodyPoly1[x]+=xoff; yBodyPoly1[x]+=yoff;
        }
        g.fillPolygon(xBodyPoly1, yBodyPoly1, lBodyPoly1);
        
        g.setColor(blue);
        int[] xBodyPoly2={xsize-208, xsize-202, xsize-200, xsize-202, xsize-205, xsize-213, xsize-208, xsize-188, xsize-168, xsize-148, xsize-140, xsize-145, xsize-158, xsize-167, xsize-153, xsize-189, xsize-186, xsize-186, xsize-188, xsize-189, xsize-191};
        int[] yBodyPoly2={503, 478, 458, 438, 418, 398, 396, 410, 425, 440, 450, 455, 462, 458, 454, 434, 444, 464, 484, 490, 498};
        int lBodyPoly2=xBodyPoly2.length;
        for(int x=0; x<lBodyPoly2; x++){
            xBodyPoly2[x]+=xoff; yBodyPoly2[x]+=yoff;
        }
        g.fillPolygon(xBodyPoly2, yBodyPoly2, lBodyPoly2);
        
        g.setColor(white);
        int[] xBodyPoly3={193, 192, 189, 188, 189, 193, 186, 185, 186, 190, 193};
        int[] yBodyPoly3={505, 498, 478, 460, 436, 420, 436, 458, 478, 498, 505};
        int lBodyPoly3=xBodyPoly3.length;
        for(int x=0; x<lBodyPoly3; x++){
            xBodyPoly3[x]+=xoff; yBodyPoly3[x]+=yoff;
        }
        g.fillPolygon(xBodyPoly3, yBodyPoly3, lBodyPoly3);
        
        g.setColor(white);
        int[] xBodyPoly4={xsize-193, xsize-192, xsize-189, xsize-188, xsize-189, xsize-193, xsize-200, xsize-207, xsize-186, xsize-185, xsize-186, xsize-190, xsize-193};
        int[] yBodyPoly4={505, 498, 478, 460, 436, 420, 410, 400, 436, 458, 478, 498, 505};
        int lBodyPoly4=xBodyPoly4.length;
        for(int x=0; x<lBodyPoly4; x++){
            xBodyPoly4[x]+=xoff; yBodyPoly4[x]+=yoff;
        }
        g.fillPolygon(xBodyPoly4, yBodyPoly4, lBodyPoly4);

        g.setColor(white);
        int[] xBodyPoly5={326, 347, 358, 353, 347, 340, 335};
        int[] yBodyPoly5={460, 452, 452, 455, 457, 461, 464};
        int lBodyPoly5=xBodyPoly5.length;
        for(int x=0; x<lBodyPoly5; x++){
            xBodyPoly5[x]+=xoff; yBodyPoly5[x]+=yoff;
        }
        g.fillPolygon(xBodyPoly5, yBodyPoly5, lBodyPoly5);
        
        g.setColor(blue);
        int[] xBodyPoly6={251, 241, 207, 207, 202, 195, 220, 235, 250, xsize-250, xsize-235, xsize-220, xsize-195, xsize-202, xsize-202, xsize-201, xsize-238, xsize-247};
        int[] yBodyPoly6={551, 575, 575, 535, 525, 515, 524, 526, 528, 528, 526, 524, 515, 525, 535, 575, 575, 550};
        int lBodyPoly6=xBodyPoly6.length;
        for(int x=0; x<lBodyPoly6; x++){
            xBodyPoly6[x]+=xoff; yBodyPoly6[x]+=yoff;
        }
        g.fillPolygon(xBodyPoly6, yBodyPoly6, lBodyPoly6);
        
        g.setColor(white);
        g.fillArc(236+xoff, 543+yoff, 30, 8, 190, 160);
        //End of Patches
        
        //----------END OF BASE MESH----------
        
        //----------SUIT DESIGN----------
        
        g.setColor(black);
        g.drawLine((xsize/2)+xoff, 122+yoff, (xsize/2)+xoff, 265+yoff);
        g.drawLine((xsize/2)+xoff, 300+yoff, (xsize/2)+xoff, 420+yoff);
        g.drawLine(345+xoff, 167+yoff, (xsize/2)+xoff, 290+yoff); g.drawLine((xsize-344)+xoff, 168+yoff, (xsize/2)+xoff, 290+yoff);
        g.drawLine(356+xoff, 245+yoff, (xsize/2)+xoff, 300+yoff); g.drawLine((xsize-356)+xoff, 245+yoff, (xsize/2)+xoff, 300+yoff);
        g.drawLine(153+xoff, 305+yoff, (xsize-153)+xoff, 305+yoff);
        g.drawArc(154+xoff, 318+yoff, 193, 40, 0, 180);
        g.drawArc(205+xoff, 327+yoff, 90, 70, 0, 180);
        g.drawArc(225+xoff, 340+yoff, 50, 45, 220, -260);
        g.drawArc(225+xoff, 340+yoff, 50, 45, 220, -260);
        g.drawArc(240+xoff, 342+yoff, 20, 40, 220, -260);
        g.drawLine(230+xoff, 375+yoff, 229+xoff, 390+yoff); g.drawLine((xsize-230)+xoff, 375+yoff, (xsize-229)+xoff, 390+yoff);
        g.drawLine(242+xoff, 375+yoff, 241+xoff, 389+yoff); g.drawLine((xsize-242)+xoff, 375+yoff, (xsize-241)+xoff, 389+yoff);
        g.drawArc(205+xoff, 390+yoff, 55, 125, 95, 130); g.drawArc((xsize-260)+xoff, 390+yoff, 55, 125, 315, 130);
        g.drawArc(226+xoff, 388+yoff, 35, 55, 95, 95); g.drawArc((xsize-254)+xoff, 389+yoff, 28, 55, 95, -105);
        
        g.drawArc(220+xoff, 388+yoff, 60, 22, 45, 90);
        g.drawLine(225+xoff, 382+yoff, 228+xoff, 390+yoff); g.drawLine((xsize-225)+xoff, 382+yoff, (xsize-228)+xoff, 390+yoff);
        
        g.drawLine(228+xoff, 490+yoff, 232+xoff, 526+yoff); g.drawLine((xsize-228)+xoff, 490+yoff, (xsize-232)+xoff, 526+yoff);
        g.drawLine(213+xoff, 495+yoff, 217+xoff, 524+yoff); g.drawLine((xsize-213)+xoff, 495+yoff, (xsize-217)+xoff, 524+yoff);
        g.drawArc(121+xoff, 440+yoff, 128, 30, 180, 90); g.drawArc((xsize-254)+xoff, 440+yoff, 138, 30, 270, 90);
        g.drawLine(165+xoff, 490+yoff, 189+xoff, 494+yoff); g.drawLine((xsize-165)+xoff, 490+yoff, (xsize-189)+xoff, 494+yoff);
         
        g.drawLine((xsize/2)+xoff, 495+yoff, (xsize/2)+xoff, 528+yoff);

        g.drawLine(232+xoff, 575+yoff, 217+xoff, 623+yoff); g.drawLine((xsize-232)+xoff, 575+yoff, (xsize-217)+xoff, 623+yoff);
        g.drawLine(218+xoff, 575+yoff, 210+xoff, 621+yoff); g.drawLine((xsize-218)+xoff, 575+yoff, (xsize-210)+xoff, 621+yoff);
        g.drawLine((xsize-208)+xoff, 575+yoff, (xsize-205)+xoff, 620+yoff);
        
        g.drawArc(215+xoff, 242+yoff, 35, 35, 270, 90); g.drawArc((xsize-250)+xoff, 242+yoff, 35, 35, 180, 90);
        g.drawArc(200+xoff, 201+yoff, 50, 50, 260, 90); g.drawArc((xsize-250)+xoff, 201+yoff, 50, 50, 190, 90);
        g.drawArc(168+xoff, 137+yoff, 85, 85, 250, 90); g.drawArc((xsize-253)+xoff, 137+yoff, 85, 85, 200, 90);
        g.drawArc(144+xoff, 90+yoff, 111, 111, 245, 90); g.drawArc((xsize-255)+xoff, 90+yoff, 111, 111, 205, 90);
        g.drawArc(110+xoff, 30+yoff, 145, 145, 250, 90); g.drawArc((xsize-255)+xoff, 30+yoff, 145, 145, 200, 90);
        
        g.drawArc(129+xoff, 142+yoff, 30, 115, 30, -90); g.drawArc((xsize-159)+xoff, 142+yoff, 30, 115, 150, 90);
        g.drawArc(166+xoff, 162+yoff, 10, 100, 20, -90); g.drawArc((xsize-176)+xoff, 162+yoff, 10, 100, 160, 90);
        
        g.drawArc(142+xoff, 250+yoff, 20, 110, 90, -90); g.drawArc((xsize-162)+xoff, 250+yoff, 20, 110, 90, 90);
        g.drawArc(152+xoff, 258+yoff, 35, 88, 85, -90); g.drawArc((xsize-187)+xoff, 258+yoff, 35, 88, 95, 90);
        
        g.drawArc(90+xoff, 297+yoff, 80, 42, 40, -90); g.drawArc((xsize-170)+xoff, 297+yoff, 80, 42, 140, 90);
        g.drawArc(136+xoff, 302+yoff, 60, 26, 55, -90); g.drawArc((xsize-196)+xoff, 302+yoff, 60, 26, 125, 90);
        
        g.drawArc(116+xoff, 330+yoff, 90, 40, 90, -90); g.drawArc((xsize-206)+xoff, 330+yoff, 90, 40, 90, 90);
        g.drawArc(162+xoff, 324+yoff, 57, 28, 90, -90); g.drawArc((xsize-219)+xoff, 324+yoff, 57, 28, 90, 90);
        
        g.drawArc(205+xoff, 348+yoff, 35, 20, 150, -90); g.drawArc((xsize-240)+xoff, 348+yoff, 35, 20, 30, 90);
        g.drawArc(199+xoff, 358+yoff, 30, 20, 130, -90); g.drawArc((xsize-229)+xoff, 358+yoff, 30, 20, 50, 90);
        g.drawArc(222+xoff, 358+yoff, 20, 20, 130, -90); g.drawArc((xsize-242)+xoff, 358+yoff, 20, 20, 50, 90);
        g.drawArc(237+xoff, 360+yoff, 15, 20, 130, -90); g.drawArc((xsize-252)+xoff, 360+yoff, 15, 20, 50, 90);
        g.drawArc(238+xoff, 371+yoff, 14, 20, 130, -90); g.drawArc((xsize-252)+xoff, 371+yoff, 14, 20, 50, 90);
        g.drawArc(226+xoff, 372+yoff, 19, 20, 140, -90); g.drawArc((xsize-245)+xoff, 372+yoff, 19, 20, 40, 90);
        g.drawArc(228+xoff, 380+yoff, 16, 12, 140, -90); g.drawArc((xsize-244)+xoff, 380+yoff, 16, 12, 40, 90);
        g.drawArc(240+xoff, 380+yoff, 12, 20, 130, -90); g.drawArc((xsize-252)+xoff, 380+yoff, 12, 20, 50, 90);
        
        g.drawArc(212+xoff, 402+yoff, 20, 12, 140, -90); g.drawArc((xsize-232)+xoff, 402+yoff, 20, 12, 40, 90);
        g.drawArc(221+xoff, 400+yoff, 35, 40, 135, -90); g.drawArc((xsize-256)+xoff, 400+yoff, 35, 40, 45, 90);
        g.drawArc(206+xoff, 433+yoff, 26, 12, 170, -90); g.drawArc((xsize-232)+xoff, 433+yoff, 26, 12, 10, 90);
        g.drawArc(206+xoff, 465+yoff, 22, 12, 170, -90); g.drawArc((xsize-228)+xoff, 465+yoff, 22, 12, 10, 90);
        g.drawArc(210+xoff, 493+yoff, 23, 20, 135, -90); g.drawArc((xsize-233)+xoff, 493+yoff, 23, 20, 45, 90);
        g.drawArc(225+xoff, 494+yoff, 30, 15, 135, -90); g.drawArc((xsize-255)+xoff, 494+yoff, 31, 15, 45, 90);
        g.drawArc(177+xoff, 508+yoff, 38, 15, 100, -90); g.drawArc((xsize-215)+xoff, 508+yoff, 38, 15, 80, 90);
        g.drawArc(212+xoff, 512+yoff, 23, 25, 135, -90); g.drawArc((xsize-235)+xoff, 512+yoff, 23, 25, 45, 90);
        g.drawArc(227+xoff, 512+yoff, 26, 25, 135, -90); g.drawArc((xsize-253)+xoff, 512+yoff, 26, 25, 45, 90);
        
        g.drawArc((xsize-215)+xoff, 372+yoff, 60, 30, 135, 90); g.drawArc(155+xoff, 372+yoff, 60, 30, 38, -83);
        g.drawArc((xsize-195)+xoff, 387+yoff, 60, 28, 110, 90); g.drawArc(135+xoff, 387+yoff, 60, 28, 60, -80);
        g.drawArc((xsize-182)+xoff, 405+yoff, 36, 28, 80, 90); g.drawArc(146+xoff, 405+yoff, 36, 28, 88, -75);
        g.drawArc((xsize-167)+xoff, 415+yoff, 28, 28, 80, 90); g.drawArc(136+xoff, 418+yoff, 28, 28, 80, -70);
        g.drawArc((xsize-153)+xoff, 425+yoff, 22, 28, 80, 90); g.drawArc(131+xoff, 425+yoff, 22, 28, 78, -68);
        g.drawArc((xsize-150)+xoff, 439+yoff, 32, 28, 45, 90); g.drawArc(118+xoff, 439+yoff, 32, 28, 100, -55);
        
        g.drawArc(134+xoff, 455+yoff, 20, 20, 80, 90); g.drawArc((xsize-154)+xoff, 455+yoff, 20, 20, 100, -95);
        g.drawArc(148+xoff, 462+yoff, 20, 13, 80, 90); g.drawArc((xsize-168)+xoff, 462+yoff, 20, 13, 100, -95);
        g.drawArc(158+xoff, 459+yoff, 20, 24, 80, 90); g.drawArc((xsize-178)+xoff, 459+yoff, 20, 24, 50, -40);
        g.drawArc(165+xoff, 460+yoff, 20, 20, 80, 90); g.drawArc((xsize-185)+xoff, 460+yoff, 20, 20, 95, -85);
        
        g.drawArc(128+xoff, 462+yoff, 30, 24, 120, 90); g.drawArc((xsize-158)+xoff, 462+yoff, 30, 24, 60, -90);
        g.drawArc(140+xoff, 465+yoff, 30, 24, 120, 90); g.drawArc((xsize-170)+xoff, 465+yoff, 30, 24, 60, -90);
        g.drawArc(150+xoff, 467+yoff, 30, 25, 130, 90); g.drawArc((xsize-180)+xoff, 467+yoff, 30, 25, 50, -90);
        g.drawArc(160+xoff, 464+yoff, 30, 30, 140, 90); g.drawArc((xsize-190)+xoff, 464+yoff, 30, 30, 40, -90);
        
        g.drawArc(175+xoff, 467+yoff, 30, 32, 125, 90); g.drawArc((xsize-205)+xoff, 467+yoff, 30, 32, 55, -90);
        g.drawArc(165+xoff, 493+yoff, 30, 32, 90, 90); g.drawArc((xsize-195)+xoff, 493+yoff, 30, 32, 90, -78);
        g.drawArc(177+xoff, 452+yoff, 30, 20, 150, 90); g.drawArc((xsize-207)+xoff, 451+yoff, 30, 21, 40, -90);
        g.drawArc(184+xoff, 495+yoff, 10, 40, 90, 90); g.drawArc((xsize-194)+xoff, 495+yoff, 10, 40, 90, -100);
        
        g.drawArc((xsize-217)+xoff, 570+yoff, 8, 10, 180, 180); g.drawArc(207+xoff, 570+yoff, 10, 10, 180, 180);
        g.drawArc((xsize-208)+xoff, 570+yoff, 6, 10, 180, 180);
        g.drawArc((xsize-240)+xoff, 570+yoff, 8, 10, 270, 110); g.drawArc(232+xoff, 570+yoff, 8, 10, 180, 180);
        g.drawArc((xsize-231)+xoff, 570+yoff, 12, 10, 180, 180); g.drawArc(219+xoff, 570+yoff, 12, 10, 180, 180);
        g.drawArc(225+xoff, 596+yoff, 10, 10, 180, 85); g.drawArc((xsize-235)+xoff, 596+yoff, 10, 10, 315, 35);
        g.drawArc(214+xoff, 595+yoff, 10, 10, 155, 180); g.drawArc((xsize-224)+xoff, 595+yoff, 10, 10, 205, 180);
        g.drawArc(206+xoff, 593+yoff, 8, 10, 155, 180); g.drawArc((xsize-214)+xoff, 593+yoff, 8, 10, 205, 180);
        g.drawArc((xsize-206)+xoff, 590+yoff, 5, 10, 205, 180);
        g.drawArc(220+xoff, 608+yoff, 10, 10, 180, 85); g.drawArc((xsize-230)+xoff, 608+yoff, 10, 10, 315, 35);
        g.drawArc(212+xoff, 607+yoff, 10, 10, 155, 180); g.drawArc((xsize-222)+xoff, 607+yoff, 10, 10, 205, 180);
        g.drawArc(206+xoff, 606+yoff, 8, 10, 155, 180); g.drawArc((xsize-214)+xoff, 606+yoff, 8, 10, 205, 180);
        g.drawArc((xsize-206)+xoff, 605+yoff, 5, 10, 205, 180);
        g.drawArc(218+xoff, 618+yoff, 8, 10, 180, 85); g.drawArc((xsize-226)+xoff, 618+yoff, 8, 10, 325, 25);
        g.drawArc(210+xoff, 616+yoff, 8, 10, 155, 180); g.drawArc((xsize-218)+xoff, 616+yoff, 8, 10, 205, 180);
        g.drawArc(206+xoff, 615+yoff, 4, 10, 155, 180); g.drawArc((xsize-211)+xoff, 616+yoff, 5, 6, 205, 180);
        g.drawArc((xsize-206)+xoff, 614+yoff, 5, 5, 205, 180);
        
        g.drawArc(185+xoff, 620+yoff, 20, 22, 0, 90); g.drawArc((xsize-205+xoff), 620+yoff, 20, 22, 180, -90);
        g.drawArc(170+xoff, 619+yoff, 26, 28, 0, 90); g.drawArc((xsize-196+xoff), 619+yoff, 26, 28, 180, -90);
        g.drawArc(155+xoff, 618+yoff, 32, 34, 0, 90); g.drawArc((xsize-187+xoff), 618+yoff, 32, 34, 180, -65);
        g.drawArc(142+xoff, 622+yoff, 30, 32, 0, 90); g.drawArc((xsize-172+xoff), 622+yoff, 30, 32, 180, -75);
        
        g.drawArc(128+xoff, 612+yoff, 30, 32, 68, -48); g.drawArc((xsize-158+xoff), 612+yoff, 30, 32, 160, -48);
        g.drawArc(145+xoff, 612+yoff, 30, 32, 68, -30); g.drawArc((xsize-175+xoff), 612+yoff, 30, 32, 145, -25);
        g.drawArc(155+xoff, 613+yoff, 30, 32, 58, -20); g.drawArc((xsize-185+xoff), 613+yoff, 30, 32, 142, -20);

        g.drawLine(230+xoff, 375+yoff, 220+xoff, 370+yoff); g.drawLine((xsize-230)+xoff, 375+yoff, (xsize-220)+xoff, 370+yoff);
        g.drawLine(230+xoff, 380+yoff, 227+xoff, 378+yoff); g.drawLine((xsize-230)+xoff, 380+yoff, (xsize-227)+xoff, 378+yoff);
        
        g.drawLine(216+xoff, 404+yoff, 208+xoff, 408+yoff); g.drawLine((xsize-216)+xoff, 404+yoff, (xsize-208)+xoff, 408+yoff);
        g.drawLine(206+xoff, 438+yoff, 200+xoff, 442+yoff); g.drawLine((xsize-206)+xoff, 438+yoff, (xsize-200)+xoff, 442+yoff);
        g.drawLine(205+xoff, 470+yoff, 200+xoff, 470+yoff); g.drawLine((xsize-205)+xoff, 470+yoff, (xsize-200)+xoff, 470+yoff);
        g.drawLine(212+xoff, 495+yoff, 204+xoff, 492+yoff); g.drawLine((xsize-212)+xoff, 495+yoff, (xsize-204)+xoff, 492+yoff);
        
        g.drawLine(195+xoff, 218+yoff, 193+xoff, 230+yoff); g.drawLine((xsize-195)+xoff, 218+yoff, (xsize-193)+xoff, 230+yoff);
        g.drawLine(220+xoff, 250+yoff, 217+xoff, 260+yoff); g.drawLine((xsize-220)+xoff, 250+yoff, (xsize-217)+xoff, 260+yoff);
        
        g.drawLine(205+xoff, 360+yoff, 180+xoff, 350+yoff); g.drawLine((xsize-205)+xoff, 360+yoff, (xsize-180)+xoff, 350+yoff);
        
        //Spider-Ham Logo
        g.setColor(black);
        g.fillOval(243+xoff, 430+yoff, 15, 20);
        g.fillRect(248+xoff, 445+yoff, 5, 10);
        
        int[] xLogoPoly={248, 244, 242, 240, 239, 237, (xsize-237), (xsize-239), (xsize-240), (xsize-242), (xsize-244), (xsize-248)};
        int[] yLogoPoly={452, 457, 460, 466, 468, 477, 477, 468, 466, 460, 457, 452};
        int lLogoPoly=xLogoPoly.length;
        for(int x=0; x<lLogoPoly; x++){
            xLogoPoly[x]+=xoff; yLogoPoly[x]+=yoff;
        }
        g.fillPolygon(xLogoPoly, yLogoPoly, lLogoPoly);
        
        g.fillArc(237+xoff, 460+yoff, 26, 30, 180, 180);
        
        g.drawLine(247+xoff, 452+yoff, 233+xoff, 442+yoff); g.drawLine((xsize-247)+xoff, 452+yoff, (xsize-233)+xoff, 442+yoff);
        g.drawLine(233+xoff, 442+yoff, 240+xoff, 423+yoff); g.drawLine((xsize-233)+xoff, 442+yoff, (xsize-240)+xoff, 423+yoff);
        
        g.drawLine(247+xoff, 452+yoff, 222+xoff, 447+yoff); g.drawLine((xsize-247)+xoff, 452+yoff, (xsize-222)+xoff, 447+yoff);
        g.drawLine(222+xoff, 447+yoff, 230+xoff, 423+yoff); g.drawLine((xsize-222)+xoff, 447+yoff, (xsize-230)+xoff, 423+yoff);
        
        g.drawLine(247+xoff, 452+yoff, 222+xoff, 462+yoff); g.drawLine((xsize-247)+xoff, 452+yoff, (xsize-222)+xoff, 462+yoff);
        g.drawLine(222+xoff, 462+yoff, 225+xoff, 480+yoff); g.drawLine((xsize-222)+xoff, 462+yoff, (xsize-225)+xoff, 480+yoff);
        g.drawLine(246+xoff, 454+yoff, 230+xoff, 473+yoff); g.drawLine((xsize-246)+xoff, 454+yoff, (xsize-230)+xoff, 473+yoff);
        g.drawLine(230+xoff, 473+yoff, 240+xoff, 490+yoff); g.drawLine((xsize-230)+xoff, 473+yoff, (xsize-240)+xoff, 490+yoff);
        //End of Spider-Ham Logo
        
        //----------END OF SUIT DESIGN----------
        
        //----------FACE DETAILS----------
        
        //Black Eyes
        g.setColor(black);
        int[] xBlkEyes={242, 214, 187, 177, 177, 182, 187, 192, 199, 207, 217, 232, 242};
        int[] yBlkEyes={275, 249, 220, 205, 225, 255, 270, 285, 295, 300, 299, 290, 275};
        int lBlkEyes=xBlkEyes.length;
        for(int x=0; x<lBlkEyes; x++){
            xBlkEyes[x]+=xoff; yBlkEyes[x]+=yoff;
        }
        g.fillPolygon(xBlkEyes, yBlkEyes, lBlkEyes);
        
        int[] xBlkEyes1={xsize-242, xsize-214, xsize-187, xsize-177, xsize-177, xsize-182, xsize-187, xsize-192, xsize-199, xsize-207, xsize-217, xsize-232, xsize-242};
        int[] yBlkEyes1={275, 249, 220, 205, 225, 255, 270, 285, 295, 300, 299, 290, 275};
        int lBlkEyes1=xBlkEyes1.length;
        for(int x=0; x<lBlkEyes1; x++){
            xBlkEyes1[x]+=xoff; yBlkEyes1[x]+=yoff;
        }
        g.fillPolygon(xBlkEyes1, yBlkEyes1, lBlkEyes1);
        //End of Black Eyes
        
        //White Eyes
        g.setColor(white);
        int[] xWhtEyes={(240-8)+2, (212-5)+2, (185-5)+2, (175-5)+2, (175+5)+2, (180+5)+2, (185+5)+2, (190+5)+2, (197+5)+2, (205+5)+2, (215-5)+2, (230-5)+2, (240-8)+2};
        int[] yWhtEyes={275, 249+5, 220+5, 205+5, 225, 255, 270, 285-5, 295-5, 300-5, 299-5, 290-5, 275};
        int lWhtEyes=xWhtEyes.length;
        for(int x=0; x<lWhtEyes; x++){
            xWhtEyes[x]+=xoff; yWhtEyes[x]+=yoff;
        }
        g.fillPolygon(xWhtEyes, yWhtEyes, lWhtEyes);
        
        int[] xWhtEyes1={xsize-((240-8)+2), xsize-((212-5)+2), xsize-((185-5)+2), xsize-((175-5)+2), xsize-((175+5)+2), xsize-((180+5)+2), xsize-((185+5)+2), xsize-((190+5)+2), xsize-((197+5)+2), xsize-((205+5)+2), xsize-((215-5)+2), xsize-((230-5)+2), xsize-((240-8)+2)};
        int[] yWhtEyes1={275, 249+5, 220+5, 205+5, 225, 255, 270, 285-5, 295-5, 300-5, 299-5, 290-5, 275};
        int lWhtEyes1=xWhtEyes1.length;
        for(int x=0; x<lWhtEyes1; x++){
            xWhtEyes1[x]+=xoff; yWhtEyes1[x]+=yoff;
        }
        g.fillPolygon(xWhtEyes1, yWhtEyes1, lWhtEyes1);
        //End of White Eyes
        
        //Nose
        g.setColor(white);
        g.fillOval(210+xoff, 277+yoff, 80, 75);
        g.setColor(red4);
        g.fillOval(213+xoff, 279+yoff, 75, 75);
        
        g.setColor(black);
        g.drawLine((xsize/2)+xoff, 280+yoff, (xsize/2)+xoff, 312+yoff); g.drawLine((xsize/2)+xoff, 321+yoff, (xsize/2)+xoff, 353+yoff);
        g.drawLine(226+xoff, 291+yoff, 246+xoff, 313+yoff); g.drawLine((xsize-226)+xoff, 291+yoff, (xsize-246)+xoff, 313+yoff);
        g.drawLine(226+xoff, 342+yoff, 246+xoff, 322+yoff); g.drawLine((xsize-226)+xoff, 342+yoff, (xsize-246)+xoff, 322+yoff);
        g.drawLine(215+xoff, 310+yoff, 246+xoff, 317+yoff); g.drawLine((xsize-213)+xoff, 310+yoff, (xsize-246)+xoff, 317+yoff);
        g.drawLine(215+xoff, 325+yoff, 246+xoff, 317+yoff); g.drawLine((xsize-215)+xoff, 325+yoff, (xsize-246)+xoff, 317+yoff);
        
        g.drawArc(200+xoff, 265+yoff, 50, 25, 270, 90); g.drawArc((xsize-250)+xoff, 265+yoff, 50, 25, 180, 90);
        g.drawArc(220+xoff, 275+yoff, 30, 25, 270, 90); g.drawArc((xsize-250)+xoff, 275+yoff, 30, 25, 180, 90);
        g.drawArc(240+xoff, 285+yoff, 10, 25, 270, 90); g.drawArc((xsize-250)+xoff, 285+yoff, 10, 25, 180, 90);
        
        g.drawArc(200+xoff, 343+yoff, 50, 25, -270, -90); g.drawArc((xsize-250)+xoff, 343+yoff, 50, 25, -180, -90);
        g.drawArc(220+xoff, 333+yoff, 30, 25, -270, -90); g.drawArc((xsize-250)+xoff, 333+yoff, 30, 25, -180, -90);
        g.drawArc(240+xoff, 323+yoff, 10, 25, -270, -90); g.drawArc((xsize-250)+xoff, 323+yoff, 10, 25, -180, -90);
        
        g.drawArc(195+xoff, 278+yoff, 30, 30, 285, 85); g.drawArc((xsize-225)+xoff, 278+yoff, 30, 30, 170, 90);
        g.drawArc(195+xoff, 325+yoff, 30, 30, -285, -85); g.drawArc((xsize-225)+xoff, 325+yoff, 30, 30, -170, -90);
        
        g.drawArc(192+xoff, 305+yoff, 25, 25, 45, -90); g.drawArc((xsize-217)+xoff, 305+yoff, 25, 25, 225, -90);
        
        g.drawLine((xsize/2)+xoff, 313+yoff, 240+xoff, 320+yoff); g.drawLine(((xsize-(xsize/2)))+xoff, 313+yoff, (xsize-240)+xoff, 320+yoff);
        g.drawLine((xsize/2)+xoff, 322+yoff, 240+xoff, 315+yoff); g.drawLine(((xsize-(xsize/2)))+xoff, 322+yoff, (xsize-240)+xoff, 315+yoff);
        g.drawLine(235+xoff, 332+yoff, 228+xoff, 320+yoff); g.drawLine((xsize-235)+xoff, 332+yoff, (xsize-228)+xoff, 320+yoff);
        g.drawLine(235+xoff, 302+yoff, 228+xoff, 320+yoff); g.drawLine((xsize-235)+xoff, 302+yoff, (xsize-228)+xoff, 320+yoff);
        
        g.setColor(black);
        g.fillArc(224+xoff, 285+yoff, 25, 45, 160, 180); g.fillArc(252+xoff, 285+yoff, 25, 45, -160, 180);
        g.setColor(white);
        g.fillArc(228+xoff, 295+yoff, 15, 32, 160, 180); g.fillArc(256+xoff, 295+yoff, 15, 32, -160, 180);
        
        //----------END OF FACE DETAILS----------
        
        //----------CANVAS GUIDES----------
//        g.setColor(black);
//        g.drawLine(xsize/2, 0, xsize/2, ysize); g.drawLine(0, ysize/2, xsize, ysize/2);
        //----------END OF CANVAS GUIDES----------
    }
}